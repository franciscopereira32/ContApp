/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import View.Planeta;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import javax.swing.Icon;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.text.View;
import org.omg.SendingContext.RunTime;


 //@author Francisco
 
public class Cmd{

    private static boolean line;
    public static void CriarDiretorio(String up) throws IOException{
        switch (Planeta.up){
            case 1:
                if (Planeta.at == 1){
                    Runtime.getRuntime().exec("cmd.exe /c start C:\\ComparaApp\\listApp.bat ");
                }
                else if (Planeta.at == 2){
                    Runtime.getRuntime().exec("cmd.exe /c start C:\\SetupLinha\\versao1.bat ");
                }
                
                else {
                
                }
            break;
            }
    }
    
   public static void CriarPacote(String actionCommand) throws IOException {
       Runtime.getRuntime().exec("cmd.exe /c start C:\\ComparaApp\\pacoteApp.bat");
   }
  
   public static void AtualizarScript(String actioCommand) throws IOException {
       Runtime.getRuntime().exec("cmd.exe /c start C:\\ComparaApp\\listApp.bat");
       }}/**
       else if (Planeta.up == 2){
           Runtime.getRuntime().exec("cmd.exe /c start C:\\Setup\\m73g.bat");
       }
       else if (Planeta.up == 3){
           Runtime.getRuntime().exec("cmd.exe /c start C:\\Setup\\so63.bat");
       }*/
   

   
    

    

