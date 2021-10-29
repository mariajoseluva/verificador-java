
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class NewJFrame extends javax.swing.JFrame {

    private String codigo = "";
    private Dimension size;
    private int width, height;

    public NewJFrame() throws InterruptedException {
        initComponents();
        pantallaPrincipal();
    }

    public void start() throws InterruptedException {
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                try {
                    pantallaPrincipal();
                    t.cancel();
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                t.cancel();
            }
        }, 4000, 4000);
    }

    public void pantallaPrincipal() throws InterruptedException {
        size = Toolkit.getDefaultToolkit().getScreenSize();
        width = Toolkit.getDefaultToolkit().getScreenSize().width;
        height = Toolkit.getDefaultToolkit().getScreenSize().height;

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
        this.setLayout(null);
        this.getContentPane().setBackground(Color.GREEN);

        logo.setVisible(true);
        logo.setIcon(new ImageIcon(new ImageIcon("img\\market.png").getImage().getScaledInstance(115, 104, Image.SCALE_DEFAULT)));
        logo.setLocation(this.getWidth() / 2 - logo.getWidth() / 4, 10);

        imgProduct.setSize(146, 132);
        imgProduct.setIcon(new ImageIcon(new ImageIcon("img\\barcode-scan.gif").getImage().getScaledInstance(146, 132, Image.SCALE_DEFAULT)));
        imgProduct.setLocation(this.getWidth() / 2 - imgProduct.getWidth() / 2, this.getHeight() / 2 + logo.getHeight() - 30);

        texto.setFont(new Font("Edwardian Script ITC", Font.ITALIC, 64));
        texto.setForeground(Color.red);
        texto.setText("Super del Sur");
        texto.setLocation(logo.getLocation().x - texto.getWidth() / 4, logo.getLocation().y + logo.getHeight());

        producto.setLocation(this.getWidth() / 2 - producto.getWidth() / 2, this.getHeight() / 2);
        producto.setFont(new Font("Verdana", Font.ITALIC, 36));
        producto.setText("¿Qué producto desea verificar?");

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        imgProduct = new javax.swing.JLabel();
        producto = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(213, 232, 212));
        setUndecorated(true);
        setSize(Toolkit. getDefaultToolkit(). getScreenSize().width, Toolkit. getDefaultToolkit(). getScreenSize().height);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        logo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        logo.setPreferredSize(new java.awt.Dimension(305, 165));

        imgProduct.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        imgProduct.setMaximumSize(new java.awt.Dimension(1000, 1000));
        imgProduct.setPreferredSize(new java.awt.Dimension(120, 120));

        producto.setFont(new java.awt.Font("Verdana", 2, 36)); // NOI18N
        producto.setForeground(new java.awt.Color(255, 255, 255));
        producto.setText("info producto");

        texto.setFont(new java.awt.Font("Edwardian Script ITC", 3, 64)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 0, 0));
        texto.setText("Super del Sur");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(imgProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(producto, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(texto)
                            .addComponent(imgProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)))
                .addGap(37, 37, 37)
                .addComponent(producto)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        producto.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:

        if (evt.getKeyCode() != 10) {
            codigo += evt.getKeyChar();
        } else {
            try {
                Connection con = null;
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/verificador_de_precios", "root", "");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT producto_nombre, producto_precio, producto_cantidad, producto_imagen FROM productos WHERE producto_codigo = " + codigo);

                if (rs.next()) {

                    try {
                        String path = rs.getString(4);
                        URL url = new URL(path);
                        BufferedImage image = ImageIO.read(url);

                        imgProduct.setSize(200, 200);
                        imgProduct.setIcon(new ImageIcon(new ImageIcon(image).getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
                        imgProduct.setLocation((this.getWidth() / 4) - (imgProduct.getWidth() / 2), (this.getHeight() / 2) - imgProduct.getHeight() / 2 + 30);

                    } catch (Exception exp) {

                        imgProduct.setSize(200, 200);
                        imgProduct.setIcon(new ImageIcon(new ImageIcon("img\\market.png").getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT)));
                        imgProduct.setLocation((this.getWidth() / 4) - (imgProduct.getWidth() / 2), (this.getHeight() / 2) - imgProduct.getHeight() / 2 + 30);

                    }

                    producto.setSize(width - 200, 150);
                    producto.setLocation(this.getWidth() / 2, this.getHeight() / 4 + texto.getHeight());
                    producto.setText("<html>Nombre: " + rs.getString(1) + "<br>Precio: " + rs.getString(2) + "<br>Stock: " + rs.getString(3));

                    start();

                } else {
                    JOptionPane.showMessageDialog(null, "Producto no encontrado");
                }

            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error" + e.toString());

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
            codigo = "";
        }

    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NewJFrame().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgProduct;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel producto;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
