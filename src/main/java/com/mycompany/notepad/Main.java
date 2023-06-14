/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.notepad;

import javax.swing.JOptionPane;

/**
 *
 * @author daivi
 */
public class Main {

    public static void exibirSobre() {
        String mensagem = "Desenvolvedor: Deivid Souza Silva\n\nDescrição do Aplicativo: O Notepad serve para fazer anotações.";
        JOptionPane.showMessageDialog(null, mensagem, "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }
}
