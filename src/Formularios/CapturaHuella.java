package Formularios;

import BD.ConexionBD;
import com.digitalpersona.onetouch.DPFPDataPurpose;
import com.digitalpersona.onetouch.DPFPFeatureSet;
import com.digitalpersona.onetouch.DPFPGlobal;
import com.digitalpersona.onetouch.DPFPSample;
import com.digitalpersona.onetouch.DPFPTemplate;
import com.digitalpersona.onetouch.capture.DPFPCapture;
import com.digitalpersona.onetouch.capture.event.DPFPDataAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPDataEvent;
import com.digitalpersona.onetouch.capture.event.DPFPErrorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPErrorEvent;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPReaderStatusEvent;
import com.digitalpersona.onetouch.capture.event.DPFPSensorAdapter;
import com.digitalpersona.onetouch.capture.event.DPFPSensorEvent;
import com.digitalpersona.onetouch.processing.DPFPEnrollment;
import com.digitalpersona.onetouch.processing.DPFPFeatureExtraction;
import com.digitalpersona.onetouch.processing.DPFPImageQualityException;
import com.digitalpersona.onetouch.verification.DPFPVerification;
import com.digitalpersona.onetouch.verification.DPFPVerificationResult;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import org.json.JSONException;
import org.json.JSONObject;


/**
 *
 * @author ING JARC
 */
public class CapturaHuella extends javax.swing.JDialog {

    /** Creates new form CapturaHuella */
    public CapturaHuella() {
        try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
         } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Imposible modificar el tema visual", "Lookandfeel inválido.",
         JOptionPane.ERROR_MESSAGE);
         }
        initComponents();
        txtArea.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panHuellas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblImagenHuella = new javax.swing.JLabel();
        panBtns = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Huellas");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panHuellas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Huella Digital Capturada", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panHuellas.setPreferredSize(new java.awt.Dimension(400, 270));
        panHuellas.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(lblImagenHuella, java.awt.BorderLayout.CENTER);

        panHuellas.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(panHuellas, java.awt.BorderLayout.NORTH);

        panBtns.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panBtns.setPreferredSize(new java.awt.Dimension(400, 190));
        panBtns.setLayout(new java.awt.BorderLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(366, 90));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setText("Registro Asistencia");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panBtns.add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel4.setLayout(new java.awt.BorderLayout());

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Lucida Sans", 1, 10)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        panBtns.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel3.setPreferredSize(new java.awt.Dimension(366, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        panBtns.add(jPanel3, java.awt.BorderLayout.SOUTH);

        getContentPane().add(panBtns, java.awt.BorderLayout.SOUTH);

        setSize(new java.awt.Dimension(459, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
}//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
    guardarHuella();
    Reclutador.clear();
    lblImagenHuella.setIcon(null);
    start();
    EnviarTexto("****************************************");
    EstadoHuellas();
}//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Iniciar();
	start();
        //EstadoHuellas();
        btnGuardar.setEnabled(false);
        jButton1.setEnabled(false);
        jCheckBox1.setSelected(true);
//        btnIdentificar.setEnabled(false);
//        btnVerificar.setEnabled(false);
        btnSalir.grabFocus();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        stop();
    }//GEN-LAST:event_formWindowClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Reclutador.clear();
        lblImagenHuella.setIcon(null);
        btnGuardar.setEnabled(false);
        jButton1.setEnabled(false);
        EnviarTexto("****************************************");
        EstadoHuellas();
        if (! Lector.isStarted()) start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        this.registroAsistencia = ! this.registroAsistencia;
        if (this.registroAsistencia == true) {
            btnGuardar.setEnabled(false);
            jButton1.setEnabled(false);
            EnviarTexto("****************************************");
            EnviarTexto("Registro de asistencia activado");
            EnviarTexto("****************************************");
        } else {
            EnviarTexto("****************************************");
            EnviarTexto("Registro de asistencia desactivado");
            EnviarTexto("****************************************");
            EstadoHuellas();
        }
        Reclutador.clear();
        lblImagenHuella.setIcon(null);
        if (! Lector.isStarted()) start();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

//Varible que permite iniciar el dispositivo de lector de huella conectado
// con sus distintos metodos.
private DPFPCapture Lector = DPFPGlobal.getCaptureFactory().createCapture();

//Varible que permite establecer las capturas de la huellas, para determina sus caracteristicas
// y poder estimar la creacion de un template de la huella para luego poder guardarla
private DPFPEnrollment Reclutador = DPFPGlobal.getEnrollmentFactory().createEnrollment();

//Esta variable tambien captura una huella del lector y crea sus caracteristcas para auntetificarla
// o verificarla con alguna guardada en la BD
private DPFPVerification Verificador = DPFPGlobal.getVerificationFactory().createVerification();

//Variable que para crear el template de la huella luego de que se hallan creado las caracteriticas
// necesarias de la huella si no ha ocurrido ningun problema
private DPFPTemplate template;
public static String TEMPLATE_PROPERTY = "template";

private boolean registroAsistencia = true;
private boolean iniciado = false;
private Date date = null;

protected void Iniciar(){
   Lector.addDataListener(new DPFPDataAdapter() {
    @Override public void dataAcquired(final DPFPDataEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
        //EnviarTexto("La Huella Digital ha sido Capturada");
        EnviarTexto("Verificando...");
        date = new Date();
        ProcesarCaptura(e.getSample());
    }});}
   });

   Lector.addReaderStatusListener(new DPFPReaderStatusAdapter() {
    @Override public void readerConnected(final DPFPReaderStatusEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
        if (! iniciado) {
            EnviarTexto("Sensor de huella digital conectado");
            iniciado = true;
        }
        
        if (registroAsistencia) {
            EnviarTexto("****************************************");
            EnviarTexto("Registro de asistencia activado");
            EnviarTexto("****************************************");
        }

    }});}
    @Override public void readerDisconnected(final DPFPReaderStatusEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
        EnviarTexto("Sensor de huella digital no conectado");
    }});}
   });

   Lector.addSensorListener(new DPFPSensorAdapter() {
    @Override public void fingerTouched(final DPFPSensorEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    //EnviarTexto("El dedo ha sido colocado sobre el Lector de Huella");
    }});}
    @Override public void fingerGone(final DPFPSensorEvent e) {
    SwingUtilities.invokeLater(new Runnable() {	public void run() {
    //EnviarTexto("El dedo ha sido quitado del Lector de Huella");
    }});}
   });

   Lector.addErrorListener(new DPFPErrorAdapter(){
    public void errorReader(final DPFPErrorEvent e){
    SwingUtilities.invokeLater(new Runnable() {  public void run() {
    EnviarTexto("Error: "+e.getError());
    }});}
   });
}

 public DPFPFeatureSet featuresinscripcion;
 public DPFPFeatureSet featuresverificacion;

 public  void ProcesarCaptura(DPFPSample sample)
 {
 // Procesar la muestra de la huella y crear un conjunto de características con el propósito de inscripción.
 featuresinscripcion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_ENROLLMENT);

 // Procesar la muestra de la huella y crear un conjunto de características con el propósito de verificacion.
 featuresverificacion = extraerCaracteristicas(sample, DPFPDataPurpose.DATA_PURPOSE_VERIFICATION);

 // Comprobar la calidad de la muestra de la huella y lo añade a su reclutador si es bueno
 if (featuresinscripcion != null)
     try{
        System.out.println("Las caracteristicas de la huella han sido creada");
        Reclutador.addFeatures(featuresinscripcion);// Agregar las caracteristicas de la huella a la plantilla a crear

        // Dibuja la huella dactilar capturada.
        Image image=CrearImagenHuella(sample);
        DibujarHuella(image);

   //     btnVerificar.setEnabled(true);
   //     btnIdentificar.setEnabled(true);

       if (this.registroAsistencia) {
           identificarHuella(false);
           Reclutador.clear();
           lblImagenHuella.setIcon(null);
       } else {
           jButton1.setEnabled(true);
       }
     }catch (DPFPImageQualityException ex) {
        System.err.println("Error: "+ex.getMessage());
     } catch (IOException ex) {
        Logger.getLogger(CapturaHuella.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
         if (! this.registroAsistencia) {
             if (Reclutador.getFeaturesNeeded() == 3) {
                int huellaRepetida = 0;
                 try {
                     huellaRepetida = identificarHuella(true);
                 } catch (IOException ex) {
                     Logger.getLogger(CapturaHuella.class.getName()).log(Level.SEVERE, null, ex);
                 }

                if (huellaRepetida != 0) {
                    JOptionPane.showMessageDialog(null, "Ya existe un registro con esta huella. ID empleado: " + huellaRepetida);
                    Reclutador.clear();
                    lblImagenHuella.setIcon(null);
                    btnGuardar.setEnabled(false);
                    jButton1.setEnabled(false);
                    EnviarTexto("****************************************");
                    EstadoHuellas();
                    return;
                }
             }
            
            EstadoHuellas();
            System.out.println("Estado plantilla: " + Reclutador.getTemplateStatus());
            // Comprueba si la plantilla se ha creado.
            switch(Reclutador.getTemplateStatus())
            {
                case TEMPLATE_STATUS_READY:	// informe de éxito y detiene  la captura de huellas
                stop();
                setTemplate(Reclutador.getTemplate());
                //EnviarTexto("La plantilla de la huella ha sido creada");
    //	    btnIdentificar.setEnabled(false);
    //          btnVerificar.setEnabled(false);
                btnGuardar.setEnabled(true);
                btnGuardar.grabFocus();
                //jButton1.setEnabled(true);
                break;

                case TEMPLATE_STATUS_FAILED: // informe de fallas y reiniciar la captura de huellas
                Reclutador.clear();
                stop();
                EstadoHuellas();
                setTemplate(null);
                JOptionPane.showMessageDialog(CapturaHuella.this, "La Plantilla de la Huella no pudo ser creada, Repita el Proceso", "Inscripcion de Huellas Dactilares", JOptionPane.ERROR_MESSAGE);
                start();
                break;
            }
         }
    }
}

 public  DPFPFeatureSet extraerCaracteristicas(DPFPSample sample, DPFPDataPurpose purpose){
     DPFPFeatureExtraction extractor = DPFPGlobal.getFeatureExtractionFactory().createFeatureExtraction();
     try {
      return extractor.createFeatureSet(sample, purpose);
     } catch (DPFPImageQualityException e) {
      return null;
     }
}

  public  Image CrearImagenHuella(DPFPSample sample) {
	return DPFPGlobal.getSampleConversionFactory().createImage(sample);
}

  public void DibujarHuella(Image image) {
        lblImagenHuella.setIcon(new ImageIcon(
        image.getScaledInstance(lblImagenHuella.getWidth(), lblImagenHuella.getHeight(), Image.SCALE_DEFAULT)));
        repaint();
 }

public  void EstadoHuellas(){
	EnviarTexto("Muestras de huellas faltantes para guardar: " + Reclutador.getFeaturesNeeded());
}

public void EnviarTexto(String string) {
        txtArea.append(string + "\n");
}

public  void start(){
	Lector.startCapture();
	//EnviarTexto("Utilizando el Lector de Huella Dactilar ");
}

public  void stop(){
        Lector.stopCapture();
        //EnviarTexto("No se está usando el Lector de Huella Dactilar ");
}

    public DPFPTemplate getTemplate() {
        return template;
    }

    public void setTemplate(DPFPTemplate template) {
        DPFPTemplate old = this.template;
	this.template = template;
	firePropertyChange(TEMPLATE_PROPERTY, old, template);
    }

ConexionBD con=new ConexionBD();
 /*
  * Guarda los datos de la huella digital actual en la base de datos
  */
    public void guardarHuella() {
        //Obtiene los datos del template de la huella actual
        ByteArrayInputStream datosHuella = new ByteArrayInputStream(template.serialize());
        Integer tamañoHuella=template.serialize().length;
        int idEmpleado = 0;
        while(true) {
            String strEmpleado = JOptionPane.showInputDialog("ID Empleado:");
            
            if (strEmpleado == null) {
               Reclutador.clear();
                lblImagenHuella.setIcon(null);
                btnGuardar.setEnabled(false);
                jButton1.setEnabled(false);
                EnviarTexto("****************************************");
                EstadoHuellas();
                return; 
            }
            
            try {
                Connection c=con.conectar();
                idEmpleado = Integer.parseInt(strEmpleado);
                PreparedStatement verificarStmt = c.prepareStatement("SELECT id FROM huellas WHERE id_empleado=?");
                verificarStmt.setInt(1, idEmpleado);
                ResultSet rs = verificarStmt.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Ya existe una huella registrada para este empleado.");
                    continue;
                }
                
                c.close();
                break;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Debes ingresar un número, por favor revisa los detalles del empleado en sinomi.dscorp.com.mx");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error. Por favor, vuelve a intentar.");
                Logger.getLogger(CapturaHuella.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                con.desconectar();
            }
        }
        
        try {
            //Establece los valores para la sentencia SQL
            Connection c=con.conectar(); //establece la conexion con la BD
            PreparedStatement guardarStmt = c.prepareStatement("INSERT INTO huellas (id_empleado, huella) values (?,?)");

            guardarStmt.setInt(1, idEmpleado);
            guardarStmt.setBinaryStream(2, datosHuella,tamañoHuella);
            //Ejecuta la sentencia
            guardarStmt.execute();
            guardarStmt.close();
            JOptionPane.showMessageDialog(null,"Huella Guardada Correctamente");
            con.desconectar();
            btnGuardar.setEnabled(false);
            jButton1.setEnabled(false);
       //     btnVerificar.grabFocus();
            
            HttpResponse<JsonNode> jsonResponse = Unirest.post("http://sinomi.dscorp.com.mx/huella")
                                .header("accept", "application/json")
                                .field("empleado", idEmpleado)
                                .asJson();

            if (jsonResponse.getStatus() == 200){
//               JOptionPane.showMessageDialog(null,"Huella Guardada Correctamente");
                System.out.println(jsonResponse.getBody());
//               btnVerificar.grabFocus();
            } else {
               JOptionPane.showMessageDialog(null,"Ocurrió un error al guardar. Por favor, vuelve a intentar.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ocurrió un error al guardar. Por favor, vuelve a intentar.");
        } catch (UnirestException ex) {
            JOptionPane.showMessageDialog(null,"Ocurrió un error al guardar. Por favor, vuelve a intentar.");
            Logger.getLogger(CapturaHuella.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            con.desconectar();
        }
        
   }

/**
* Verifica la huella digital actual contra otra en la base de datos
*/
 public void verificarHuella(String nom) {
    try {
    //Establece los valores para la sentencia SQL
    Connection c=con.conectar();
    //Obtiene la plantilla correspondiente a la persona indicada
    PreparedStatement verificarStmt = c.prepareStatement("SELECT huehuella FROM somhue WHERE huenombre=?");
    verificarStmt.setString(1,nom);
    ResultSet rs = verificarStmt.executeQuery();

    //Si se encuentra el nombre en la base de datos
    if (rs.next()){
    //Lee la plantilla de la base de datos
    byte templateBuffer[] = rs.getBytes("huehuella");
    //Crea una nueva plantilla a partir de la guardada en la base de datos
    DPFPTemplate referenceTemplate = DPFPGlobal.getTemplateFactory().createTemplate(templateBuffer);
    //Envia la plantilla creada al objeto contendor de Template del componente de huella digital
    setTemplate(referenceTemplate);

    // Compara las caracteriticas de la huella recientemente capturda con la
    // plantilla guardada al usuario especifico en la base de datos
    DPFPVerificationResult result = Verificador.verify(featuresverificacion, getTemplate());

    //compara las plantilas (actual vs bd)
    if (result.isVerified())
    JOptionPane.showMessageDialog(null, "Las huella capturada coinciden con la de "+nom,"Verificacion de Huella", JOptionPane.INFORMATION_MESSAGE);
    else
    JOptionPane.showMessageDialog(null, "No corresponde la huella con "+nom, "Verificacion de Huella", JOptionPane.ERROR_MESSAGE);

    //Si no encuentra alguna huella correspondiente al nombre lo indica con un mensaje
    } else {
    JOptionPane.showMessageDialog(null, "No existe un registro de huella para "+nom, "Verificacion de Huella", JOptionPane.ERROR_MESSAGE);
    }
    } catch (SQLException e) {
    //Si ocurre un error lo indica en la consola
    System.err.println("Error al verificar los datos de la huella.");
    }finally{
       con.desconectar();
    }
   }

 /**
  * Identifica a una persona registrada por medio de su huella digital
  */
  public int identificarHuella(boolean verificarHuellaRepetida) throws IOException{
     try {
       //Establece los valores para la sentencia SQL
       Connection c=con.conectar();

       //Obtiene todas las huellas de la bd
       PreparedStatement identificarStmt = c.prepareStatement("SELECT id_empleado,huella FROM huellas");
       ResultSet rs = identificarStmt.executeQuery();

       while(rs.next()){
            //Lee la plantilla de la base de datos
            byte templateBuffer[] = rs.getBytes("huella");
            int idEmpleado = rs.getInt("id_empleado");
            //Crea una nueva plantilla a partir de la guardada en la base de datos
            DPFPTemplate referenceTemplate = DPFPGlobal.getTemplateFactory().createTemplate(templateBuffer);
            //Envia la plantilla creada al objeto contendor de Template del componente de huella digital
            setTemplate(referenceTemplate);

            // Compara las caracteriticas de la huella recientemente capturda con la
            // alguna plantilla guardada en la base de datos que coincide con ese tipo
            DPFPVerificationResult result = Verificador.verify(featuresverificacion, getTemplate());

            //compara las plantilas (actual vs bd)
            //Si encuentra correspondencia dibuja el mapa
            //e indica el nombre de la persona que coincidió.
            if (result.isVerified()){
                if (! verificarHuellaRepetida) {
                    DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
                    System.out.println("Hora: " + hourFormat.format(this.date));
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                    System.out.println("Fecha: " + dateFormat.format(this.date));

                    HttpResponse<JsonNode> jsonResponse;
                    try {
                        jsonResponse = Unirest.post("http://sinomi.dscorp.com.mx/asistencia")
                                .header("accept", "application/json")
                                .field("empleado", idEmpleado)
                                .field("hora", hourFormat.format(this.date))
                                .field("fecha", dateFormat.format(this.date))
                                .asJson();
                        
                        System.out.println(jsonResponse.getStatus());

                        if (jsonResponse.getStatus() == 200){
            //               JOptionPane.showMessageDialog(null,"Huella Guardada Correctamente");
                            System.out.println(jsonResponse.getBody());
            //               btnVerificar.grabFocus();
                            //JOptionPane.showMessageDialog(null, "Asistencia registrada","Verificacion de Huella", JOptionPane.INFORMATION_MESSAGE);
                            System.out.println("Asistencia registrada.");
                            EnviarTexto("Asistencia registrada.");
                        } else {
                            System.out.println("Ocurrió un error al registrar asistencia.");
                            EnviarTexto("Ocurrió un error al registrar asistencia.");
                           //JOptionPane.showMessageDialog(null,"Ocurrió un error al guardar. Por favor, vuelve a intentar.");
                        }
                    } catch (UnirestException ex) {
                        EnviarTexto("Ocurrió un error al registrar asistencia.");
                        System.out.println("Ocurrió un error al registrar asistencia.");
                        Logger.getLogger(CapturaHuella.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                return idEmpleado;
            }
       }
            if(! verificarHuellaRepetida) {
                //Si no encuentra alguna huella correspondiente al nombre lo indica con un mensaje
                //JOptionPane.showMessageDialog(null, "No existe ningún registro que coincida con la huella", "Verificacion de Huella", JOptionPane.ERROR_MESSAGE);
                System.out.println("No existe ningún registro que coincida con la huella");
                EnviarTexto("No existe ningún registro que coincida con la huella");
                setTemplate(null);
            }
       } catch (SQLException e) {
            //Si ocurre un error lo indica en la consola
            System.err.println("Error al identificar huella dactilar."+e.getMessage());
            EnviarTexto("Error al identificar huella dactilar.");
       } finally{
            con.desconectar();
       }
     
        return 0;
   }

  
  
/*
* @param args the command line arguments
*/

public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapturaHuella().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagenHuella;
    private javax.swing.JPanel panBtns;
    private javax.swing.JPanel panHuellas;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables

}
