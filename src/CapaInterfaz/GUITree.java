package CapaInterfaz;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class GUITree extends javax.swing.JFrame {


    /**
     * Creates new form GUITree
     */
    public GUITree() {
        initComponents();
        
        this.TreeView.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode  = (DefaultMutableTreeNode) TreeView.getLastSelectedPathComponent();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Scroll = new javax.swing.JScrollPane();
        TreeView = new javax.swing.JTree();
        BtnInsertar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TtaInfo = new javax.swing.JTextArea();
        PnlFormulario = new javax.swing.JPanel();
        PnlFormArbol = new javax.swing.JPanel();
        CbxTipoNodo = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        LblTipoNodo = new javax.swing.JLabel();
        LblTipoExpresion = new javax.swing.JLabel();
        label5 = new java.awt.Label();
        PnlFormHijo = new javax.swing.JPanel();
        TxtPosRango = new javax.swing.JTextField();
        RdoFalse = new javax.swing.JRadioButton();
        LblPosRango = new javax.swing.JLabel();
        LblOpcion = new javax.swing.JLabel();
        RdoTrue = new javax.swing.JRadioButton();
        label4 = new java.awt.Label();
        PnlFormActivos = new javax.swing.JPanel();
        TxtNomActivos = new javax.swing.JTextField();
        CbxTipo = new javax.swing.JComboBox<>();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        TxtDocEstado = new javax.swing.JTextField();
        LblNomActivos = new javax.swing.JLabel();
        LblTipo = new javax.swing.JLabel();
        LblMonitor = new javax.swing.JLabel();
        LblDocEstado = new javax.swing.JLabel();
        CbxEstActivos = new javax.swing.JComboBox<>();
        LblEstActivos = new javax.swing.JLabel();
        label3 = new java.awt.Label();
        PnlSentencias = new javax.swing.JPanel();
        TxtNomSentencias = new javax.swing.JTextField();
        TxtEstSentencias = new javax.swing.JTextField();
        TxtQuery = new javax.swing.JTextField();
        DcrAprobacion = new com.toedter.calendar.JDateChooser();
        LblNomSentencias = new javax.swing.JLabel();
        LblQuery = new javax.swing.JLabel();
        LblEstSentencias = new javax.swing.JLabel();
        LblDate = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        PnlFormVariables = new javax.swing.JPanel();
        TxtNomVariables = new javax.swing.JTextField();
        TxtTipVariables = new javax.swing.JTextField();
        TxtLargo = new javax.swing.JTextField();
        TxtValEntero = new javax.swing.JTextField();
        TxtValReal = new javax.swing.JTextField();
        TxtValString = new javax.swing.JTextField();
        TxtVecEntero = new javax.swing.JTextField();
        TxtVecString = new javax.swing.JTextField();
        LblNomVariables = new javax.swing.JLabel();
        LblTipVariables = new javax.swing.JLabel();
        LblLargo = new javax.swing.JLabel();
        LblValEntero = new javax.swing.JLabel();
        LblValReal = new javax.swing.JLabel();
        LblValSring = new javax.swing.JLabel();
        LblVecEntero = new javax.swing.JLabel();
        LblVecString = new javax.swing.JLabel();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Scroll.setViewportView(TreeView);

        BtnInsertar.setText("Insertar");
        BtnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInsertarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        TtaInfo.setColumns(20);
        TtaInfo.setRows(5);
        jScrollPane1.setViewportView(TtaInfo);

        PnlFormulario.setLayout(new java.awt.CardLayout());

        CbxTipoNodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        LblTipoNodo.setText("Tipo Nodo");

        LblTipoExpresion.setText("Tipo Expresion");

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label5.setText("FORMULARIO ARBOL");

        javax.swing.GroupLayout PnlFormArbolLayout = new javax.swing.GroupLayout(PnlFormArbol);
        PnlFormArbol.setLayout(PnlFormArbolLayout);
        PnlFormArbolLayout.setHorizontalGroup(
            PnlFormArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlFormArbolLayout.createSequentialGroup()
                .addGroup(PnlFormArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlFormArbolLayout.createSequentialGroup()
                        .addComponent(LblTipoNodo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PnlFormArbolLayout.createSequentialGroup()
                        .addComponent(LblTipoExpresion)
                        .addGap(27, 27, 27)))
                .addGroup(PnlFormArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlFormArbolLayout.createSequentialGroup()
                        .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(79, 79, 79))
                    .addGroup(PnlFormArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PnlFormArbolLayout.createSequentialGroup()
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(CbxTipoNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        PnlFormArbolLayout.setVerticalGroup(
            PnlFormArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFormArbolLayout.createSequentialGroup()
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(PnlFormArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxTipoNodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTipoNodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlFormArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTipoExpresion)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        PnlFormulario.add(PnlFormArbol, "card2");

        RdoFalse.setLabel("False");

        LblPosRango.setText("Posicion Rango");

        LblOpcion.setText("Opcion");

        RdoTrue.setLabel("True");

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label4.setText("FORMULARIO HIJO");

        javax.swing.GroupLayout PnlFormHijoLayout = new javax.swing.GroupLayout(PnlFormHijo);
        PnlFormHijo.setLayout(PnlFormHijoLayout);
        PnlFormHijoLayout.setHorizontalGroup(
            PnlFormHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFormHijoLayout.createSequentialGroup()
                .addGroup(PnlFormHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlFormHijoLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(LblOpcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addComponent(LblPosRango, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlFormHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtPosRango)
                    .addGroup(PnlFormHijoLayout.createSequentialGroup()
                        .addGroup(PnlFormHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RdoTrue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RdoFalse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(157, 157, 157))))
            .addGroup(PnlFormHijoLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(101, 101, 101))
        );
        PnlFormHijoLayout.setVerticalGroup(
            PnlFormHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlFormHijoLayout.createSequentialGroup()
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(PnlFormHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPosRango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPosRango))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlFormHijoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RdoTrue)
                    .addComponent(LblOpcion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RdoFalse)
                .addGap(41, 41, 41))
        );

        PnlFormulario.add(PnlFormHijo, "card3");

        CbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jRadioButton5.setText("jRadioButton5");

        jRadioButton6.setText("jRadioButton6");

        LblNomActivos.setText("Nombre");

        LblTipo.setText("Tipo");

        LblMonitor.setText("Monitor");

        LblDocEstado.setText("Doc Estado");

        CbxEstActivos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        LblEstActivos.setText("Estado");

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label3.setText("FORMULARIO ACTIVOS");

        javax.swing.GroupLayout PnlFormActivosLayout = new javax.swing.GroupLayout(PnlFormActivos);
        PnlFormActivos.setLayout(PnlFormActivosLayout);
        PnlFormActivosLayout.setHorizontalGroup(
            PnlFormActivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFormActivosLayout.createSequentialGroup()
                .addGroup(PnlFormActivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblNomActivos)
                    .addComponent(LblDocEstado)
                    .addComponent(LblTipo))
                .addGap(21, 21, 21)
                .addGroup(PnlFormActivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNomActivos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlFormActivosLayout.createSequentialGroup()
                        .addComponent(TxtDocEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CbxTipo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(PnlFormActivosLayout.createSequentialGroup()
                .addGroup(PnlFormActivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblEstActivos)
                    .addComponent(LblMonitor))
                .addGap(37, 37, 37)
                .addGroup(PnlFormActivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlFormActivosLayout.createSequentialGroup()
                        .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CbxEstActivos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(PnlFormActivosLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(82, 82, 82))
        );
        PnlFormActivosLayout.setVerticalGroup(
            PnlFormActivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlFormActivosLayout.createSequentialGroup()
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(PnlFormActivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomActivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNomActivos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlFormActivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlFormActivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxEstActivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblEstActivos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlFormActivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6)
                    .addComponent(LblMonitor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlFormActivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDocEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblDocEstado)))
        );

        PnlFormulario.add(PnlFormActivos, "card4");

        LblNomSentencias.setText("Nombre");

        LblQuery.setText("Query");

        LblEstSentencias.setText("Estado");

        LblDate.setText("Fecha Aprobacion");

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setText("FORMULARIO SENTENCIAS");

        javax.swing.GroupLayout PnlSentenciasLayout = new javax.swing.GroupLayout(PnlSentencias);
        PnlSentencias.setLayout(PnlSentenciasLayout);
        PnlSentenciasLayout.setHorizontalGroup(
            PnlSentenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PnlSentenciasLayout.createSequentialGroup()
                .addGroup(PnlSentenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlSentenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LblNomSentencias)
                        .addComponent(LblEstSentencias, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(LblQuery))
                .addGap(18, 18, 18)
                .addGroup(PnlSentenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TxtEstSentencias, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtQuery)
                    .addComponent(TxtNomSentencias, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
            .addGroup(PnlSentenciasLayout.createSequentialGroup()
                .addComponent(LblDate)
                .addGap(18, 18, 18)
                .addComponent(DcrAprobacion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PnlSentenciasLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(72, 72, 72))
        );
        PnlSentenciasLayout.setVerticalGroup(
            PnlSentenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlSentenciasLayout.createSequentialGroup()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(PnlSentenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomSentencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNomSentencias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlSentenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtEstSentencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblEstSentencias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlSentenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtQuery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblQuery))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PnlSentenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DcrAprobacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblDate)))
        );

        PnlFormulario.add(PnlSentencias, "card5");

        LblNomVariables.setText("Nombre");

        LblTipVariables.setText("Tipo");

        LblLargo.setText("Largo");

        LblValEntero.setText("Valor Entero");

        LblValReal.setText("Valor Real");

        LblValSring.setText("Valor String");

        LblVecEntero.setText("Vector Entero");

        LblVecString.setText("Vector String");

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label1.setText("FORMULARIO VARIABLES");

        javax.swing.GroupLayout PnlFormVariablesLayout = new javax.swing.GroupLayout(PnlFormVariables);
        PnlFormVariables.setLayout(PnlFormVariablesLayout);
        PnlFormVariablesLayout.setHorizontalGroup(
            PnlFormVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFormVariablesLayout.createSequentialGroup()
                .addGroup(PnlFormVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtNomVariables, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNomVariables)
                    .addComponent(TxtValEntero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblValEntero))
                .addGap(18, 18, 18)
                .addGroup(PnlFormVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtValReal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblValReal, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblTipVariables, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTipVariables, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlFormVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtLargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtValString, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblLargo)
                    .addComponent(LblValSring)))
            .addGroup(PnlFormVariablesLayout.createSequentialGroup()
                .addGroup(PnlFormVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtVecEntero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblVecEntero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlFormVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtVecString, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblVecString)))
            .addGroup(PnlFormVariablesLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(78, 78, 78))
        );
        PnlFormVariablesLayout.setVerticalGroup(
            PnlFormVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFormVariablesLayout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlFormVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNomVariables)
                    .addComponent(LblTipVariables)
                    .addComponent(LblLargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlFormVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNomVariables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtTipVariables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtLargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlFormVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblValEntero)
                    .addComponent(LblValReal)
                    .addComponent(LblValSring))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlFormVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtValEntero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtValReal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtValString, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlFormVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblVecString)
                    .addComponent(LblVecEntero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PnlFormVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtVecEntero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtVecString, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        TxtNomVariables.getAccessibleContext().setAccessibleName("");
        TxtTipVariables.getAccessibleContext().setAccessibleName("");
        TxtLargo.getAccessibleContext().setAccessibleName("");
        TxtValEntero.getAccessibleContext().setAccessibleName("");
        TxtValReal.getAccessibleContext().setAccessibleName("");
        TxtValString.getAccessibleContext().setAccessibleName("");
        TxtVecEntero.getAccessibleContext().setAccessibleName("");
        TxtVecString.getAccessibleContext().setAccessibleName("");
        LblNomVariables.getAccessibleContext().setAccessibleName("");
        LblTipVariables.getAccessibleContext().setAccessibleName("");
        LblLargo.getAccessibleContext().setAccessibleName("");
        LblValEntero.getAccessibleContext().setAccessibleName("");
        LblVecEntero.getAccessibleContext().setAccessibleName("");
        LblVecString.getAccessibleContext().setAccessibleName("");

        PnlFormulario.add(PnlFormVariables, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PnlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PnlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnModificar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnInsertar)
                                .addComponent(BtnEliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInsertarActionPerformed
        
    }//GEN-LAST:event_BtnInsertarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        
    }//GEN-LAST:event_BtnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(GUITree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUITree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUITree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUITree.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUITree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnInsertar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JComboBox<String> CbxEstActivos;
    private javax.swing.JComboBox<String> CbxTipo;
    private javax.swing.JComboBox<String> CbxTipoNodo;
    private com.toedter.calendar.JDateChooser DcrAprobacion;
    private javax.swing.JLabel LblDate;
    private javax.swing.JLabel LblDocEstado;
    private javax.swing.JLabel LblEstActivos;
    private javax.swing.JLabel LblEstSentencias;
    private javax.swing.JLabel LblLargo;
    private javax.swing.JLabel LblMonitor;
    private javax.swing.JLabel LblNomActivos;
    private javax.swing.JLabel LblNomSentencias;
    private javax.swing.JLabel LblNomVariables;
    private javax.swing.JLabel LblOpcion;
    private javax.swing.JLabel LblPosRango;
    private javax.swing.JLabel LblQuery;
    private javax.swing.JLabel LblTipVariables;
    private javax.swing.JLabel LblTipo;
    private javax.swing.JLabel LblTipoExpresion;
    private javax.swing.JLabel LblTipoNodo;
    private javax.swing.JLabel LblValEntero;
    private javax.swing.JLabel LblValReal;
    private javax.swing.JLabel LblValSring;
    private javax.swing.JLabel LblVecEntero;
    private javax.swing.JLabel LblVecString;
    private javax.swing.JPanel PnlFormActivos;
    private javax.swing.JPanel PnlFormArbol;
    private javax.swing.JPanel PnlFormHijo;
    private javax.swing.JPanel PnlFormVariables;
    private javax.swing.JPanel PnlFormulario;
    private javax.swing.JPanel PnlSentencias;
    private javax.swing.JRadioButton RdoFalse;
    private javax.swing.JRadioButton RdoTrue;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JTree TreeView;
    private javax.swing.JTextArea TtaInfo;
    private javax.swing.JTextField TxtDocEstado;
    private javax.swing.JTextField TxtEstSentencias;
    private javax.swing.JTextField TxtLargo;
    private javax.swing.JTextField TxtNomActivos;
    private javax.swing.JTextField TxtNomSentencias;
    private javax.swing.JTextField TxtNomVariables;
    private javax.swing.JTextField TxtPosRango;
    private javax.swing.JTextField TxtQuery;
    private javax.swing.JTextField TxtTipVariables;
    private javax.swing.JTextField TxtValEntero;
    private javax.swing.JTextField TxtValReal;
    private javax.swing.JTextField TxtValString;
    private javax.swing.JTextField TxtVecEntero;
    private javax.swing.JTextField TxtVecString;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    // End of variables declaration//GEN-END:variables
}
