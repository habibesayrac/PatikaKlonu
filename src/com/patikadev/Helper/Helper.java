package com.patikadev.Helper;

import javax.swing.*;
import java.awt.*;

public class Helper {
    public static void  setLayout(){

        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            if ("Nimbus".equals(info.getName())){
                try {
                    UIManager.setLookAndFeel((info.getClassName()));
                } catch (ClassNotFoundException e) {
                  e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (UnsupportedLookAndFeelException e) {
                    e.printStackTrace();
                }
                break;

            }
        }
    }
    public static int screenCenterPoint(String eksen,Dimension size){
        int point;

        switch (eksen){
            case "x":
                point = (Toolkit.getDefaultToolkit().getScreenSize().width-size.width)/2;
                break;
            case "y":
               point= (Toolkit.getDefaultToolkit().getScreenSize().height-size.height)/2;
               break;
            default:
                point=0;

        }
        return point;
    }
    public static boolean isFieldEmpty(JTextField field){
        return field.getText().trim().isEmpty() ;

    }
    public static void showMsg(String str){
        String msg;
        String title;
        optionPageTR();
        switch (str){
            case "fill":
                msg = ("Lütfen tüm alanları doldurunuz!");
                title = "Hata!";
                break;
            case "done":
                msg = "İşlem başarılı ";
                title = "Sonuç!";
                break;
            case "error":
                msg="Bir hata oluştu";
                title = "Hata!";
                break;
            default:
                msg = str;
                title = "Mesaj";
        }
        JOptionPane.showMessageDialog(null,msg,title,JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirm(String str){
        String msg;
        optionPageTR();
        switch (str){
            case "sure":
                msg = "Bu işlemi gerçekleştirmek istediğinize emin misiniz?";
                break;
            default:
                msg = str;
        }
        return JOptionPane.showConfirmDialog(null, msg,"Son kararınız mı?",JOptionPane.YES_NO_OPTION)==0;

    }
    public static void optionPageTR(){
        UIManager.put("OptionPane.okButtonText" ,"Tamam" );
        UIManager.put("OptionPane.yesButtonText" ,"Evet" );
        UIManager.put("OptionPane.noButtonText" ,"Hayır" );


    }

}
