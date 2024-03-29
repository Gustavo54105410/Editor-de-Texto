/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import java.awt.Event;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.HashMap;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultEditorKit;


/**
 *
 * @author DELL
 */
public class Editor extends javax.swing.JFrame {

    /**
     * Creates new form Editor
     */
    public Editor() {
        lye = new LeerYEscribir();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.PNG"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardar(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.PNG"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAbrir(evt);
            }
        });
        jToolBar1.add(jButton2);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.PNG"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrar(evt);
            }
        });
        jToolBar1.add(jButton3);

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.PNG"))); // NOI18N
        jMenuItem1.setText("Nuevo");
        jMenuItem1.setToolTipText("Archivo nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuNuevo(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abrir.PNG"))); // NOI18N
        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuAbrir(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.PNG"))); // NOI18N
        jMenuItem3.setText("Guardar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuGuardar(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Copiar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCopiar(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Pegar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPegar(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem6.setText("Cortar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCortar(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardar
            op = JOptionPane.showConfirmDialog(rootPane, "¿Deseas guardar el archivo?", "GUARDAR", 2, 2);
            guardar(op);
    }//GEN-LAST:event_botonGuardar

    private void botonAbrir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAbrir

        op = JOptionPane.showConfirmDialog(rootPane, "¿Deseas guardar el archivo actual?", "GUARDAR", 2, 2);      
        guardar(op);
        areaTexto.setText("");
        
        JFileChooser archivo = new JFileChooser("src/archivos");
        archivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        archivo.showOpenDialog(rootPane);
        archivoEncontrado = archivo.getSelectedFile().getAbsolutePath();
        try{
            textoArchivo = lye.abrirArchivo(archivoEncontrado);
            this.setTitle(archivo.getSelectedFile().getName());
            areaTexto.setText(textoArchivo);
        }catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, "Archivo no encontrado");
        }
    }//GEN-LAST:event_botonAbrir

    private void botonBorrar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrar
        areaTexto.setText("");
    }//GEN-LAST:event_botonBorrar

    private void botonMenuNuevo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuNuevo
        op = JOptionPane.showConfirmDialog(rootPane, "¿Deseas guardar el archivo actual?", "GUARDAR", 2, 2);      
        guardar(op);
        
        areaTexto.setText("");
        this.setTitle("");
    }//GEN-LAST:event_botonMenuNuevo

    private void botonMenuAbrir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuAbrir
        // TODO add your handling code here:
        op = JOptionPane.showConfirmDialog(rootPane, "¿Deseas guardar el archivo actual?", "GUARDAR", 2, 2);      
        guardar(op);
        areaTexto.setText("");
        
        JFileChooser archivo = new JFileChooser("src/archivos");
        archivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        archivo.showOpenDialog(rootPane);
        archivoEncontrado = archivo.getSelectedFile().getAbsolutePath();
        try{
            textoArchivo = lye.abrirArchivo(archivoEncontrado);
            this.setTitle(archivo.getSelectedFile().getName());
            areaTexto.setText(textoArchivo);
        }catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, "Archivo no encontrado");
        }
    }//GEN-LAST:event_botonMenuAbrir

    private void botonMenuGuardar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuGuardar
        op = JOptionPane.showConfirmDialog(rootPane, "¿Deseas guardar el archivo?", "GUARDAR", 2, 2);
            guardar(op);
    }//GEN-LAST:event_botonMenuGuardar

    private void botonPegar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPegar
        // Se obtiene el contenido del portapapeles
        areaTexto.paste();
    }//GEN-LAST:event_botonPegar

    private void botonCopiar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCopiar
        // TODO add your handling code here:
        areaTexto.copy();
    }//GEN-LAST:event_botonCopiar

    private void botonCortar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCortar
        // TODO add your handling code here:
        areaTexto.cut();
    }//GEN-LAST:event_botonCortar
    
    private void guardar(int op){
        try{
            if(op == 0){
                    if("".equals(this.getTitle())){
                        String nombreArchivo = JOptionPane.showInputDialog(rootPane, 
                                                                        "Ingresa el nombre de tu archivo",
                                                                        "NOMBRE DEL ARCHIVO",
                                                                        JOptionPane.INFORMATION_MESSAGE);
                        prov = lye.guardarArchivo(areaTexto.getText(), nombreArchivo);
                        if(prov == 0){
                        this.setTitle(nombreArchivo + ".txt");
                        }else if(prov == 1){
                            JOptionPane.showMessageDialog(null, "Nombre de archivo invalido",
                                                        "ARCIVO INVALIDO", JOptionPane.ERROR_MESSAGE);
                        }else if(prov == 2){
                            JOptionPane.showMessageDialog(null, "El nombre del archivo ya existe",
                                                        "ARCIVO EXISTENTE", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        String arreglo [] = this.getTitle().split("\\.");
                        prov = lye.guardarArchivo(areaTexto.getText(), arreglo[0]);
                        this.setTitle(arreglo[0] + ".txt");
                    }
                }else if(op == 1){

                }
        }catch(IOException e){
            JOptionPane.showMessageDialog(rootPane, "No se pudo guardar el archivo");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }
    
    
    Transferable t;
    LeerYEscribir lye;
    String archivoEncontrado;
    String textoArchivo;
    int op;
    int prov;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
