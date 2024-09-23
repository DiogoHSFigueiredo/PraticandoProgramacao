/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exelivrodeitelcap24;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.regex.PatternSyntaxException;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableModel;

//Exibe o conteudo da tabela Authors no banco de dados de livros.
/**
 *
 * @author Diogo
 */
public class DisplayQueryResults extends JFrame {

    //Url de banco de dados, nome de usuário e senha
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/aulas";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "senhabanco2023@";

    //consulta padrao recupera todos os dados da tabela Authors
    private static final String DEFAULT_QUERY = "SELECT * FROM Authors";

    private static ResultSetTableModel tableModel;

    public static void main(String[] args) {
        
            //cria o ResultSetTableModel e exibe tabela de banco de dados
        try {

            //cria o TableModel para resultados da consulta Select * From authors
            tableModel = new ResultSetTableModel(DATABASE_URL, USERNAME, PASSWORD, DEFAULT_QUERY);

            //configura JTextArea em que o usuário digita consultas
            final JTextArea queryArea = new JTextArea(DEFAULT_QUERY, 3, 100);
            queryArea.setWrapStyleWord(true);
            queryArea.setLineWrap(true);

            JScrollPane scrollPane = new JScrollPane(queryArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

            //configura JButton para enviar consultas
            JButton submitButton = new JButton("Submit Query");

            //cria o Box para gerenciar o posicionamento da queryArea e do submitButton na GUI
            Box boxNorth = Box.createHorizontalBox();
            boxNorth.add(scrollPane);
            boxNorth.add(submitButton);

            //cria JTable com base no TableModel
            JTable resultTable = new JTable(tableModel);

            JLabel filterLabel = new JLabel("Filter:");
            final JTextField filterText = new JTextField();
            JButton filterButton = new JButton("Apply Filter");
            Box boxSouth = Box.createHorizontalBox();

            boxSouth.add(filterLabel);
            boxSouth.add(filterText);
            boxSouth.add(filterButton);

            //posiciona componentes GUI no painel de conteudo do JFrame
            JFrame window = new JFrame("Displaying Query Results");
            window.add(boxNorth, BorderLayout.NORTH);
            window.add(new JScrollPane(resultTable), BorderLayout.CENTER);
            window.add(boxSouth, BorderLayout.SOUTH);

            //cria evento ouvinte para submitButton
            submitButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    //realiza uma nova consulta
                    try {
                        tableModel.setQuery(queryArea.getText());
                    } catch (SQLException sqlException) {
                        JOptionPane.showMessageDialog(null, sqlException.getMessage(), "Database error", JOptionPane.ERROR_MESSAGE);

                        //tenta recuperar a partir da consulta de usuario inválida
                        //executando consulta padrão
                        try {
                            tableModel.setQuery(DEFAULT_QUERY);
                            queryArea.setText(DEFAULT_QUERY);
                        } catch (SQLException sqlException2) {
                            JOptionPane.showMessageDialog(null, sqlException2.getMessage(), "Database error", JOptionPane.ERROR_MESSAGE);

                            //assegura que a conexao de banco de dados está fechada
                            tableModel.disconnectFromDatabase();

                            System.exit(1); //termina o aplicativo
                        }
                    }
                }
            }
            );

            final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableModel);
            resultTable.setRowSorter(sorter);

            //cria ouvinte para filterButton
            filterButton.addActionListener(new ActionListener() {

                //passa o texto de filtro para o ouvinte
                public void actionPerformed(ActionEvent e) {
                    String text = filterText.getText();

                    if (text.length() == 0) {
                        sorter.setRowFilter(null);
                    } else {
                        try {
                            sorter.setRowFilter(RowFilter.regexFilter(text));
                        } catch (PatternSyntaxException pse) {
                            JOptionPane.showMessageDialog(null, "Bad regex pattern", "Bad regex pattern", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
            );

            //dispoe da janela quando o usuario fecha o aplicativo (isso sobrescreve o padrao de HIDE_ON_CLOSE)
            window.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            window.setSize(500, 250);
            window.setVisible(true);

            //assegura que o banco de dados é fechado quando o usuario fechar o aplicativo
            window.addWindowListener(new WindowAdapter() {
                //desconecta-se do banco de dados e sai quando a janela for fechada
                public void windowClosed(WindowEvent event) {
                    tableModel.disconnectFromDatabase();
                    System.exit(0);
                }
            }
            );
        } catch (SQLException sqlException) {
            JOptionPane.showMessageDialog(null, sqlException.getMessage(), "Database erro", JOptionPane.ERROR_MESSAGE);
            tableModel.disconnectFromDatabase();
            System.exit(1); //termina o aplicativo
        }
    }
} //fim da classe DisplayQueryResults
