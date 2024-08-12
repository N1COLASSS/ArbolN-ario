package CapaInterfaz;
import CapaNegocio.Activos;
import CapaNegocio.NodoArbol;
import CapaNegocio.NodoHijo;
import CapaNegocio.Sentencias;
import CapaNegocio.Tree;
import CapaNegocio.VariablesContexto;
import java.math.BigDecimal;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;

public class GUITree extends javax.swing.JFrame {

    Tree arbol;
    boolean flag = true;
    public NodoHijo nodoSeleccionado;
    public JComboBox<String> cbm;

    ImageIcon icon = new ImageIcon(".//res//tree.png");

    public GUITree() {
        initComponents();
        this.setIconImage(icon.getImage());

        DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) TreeView.getCellRenderer();
        renderer.setLeafIcon(null);
        renderer.setClosedIcon(null);
        renderer.setOpenIcon(null);

        cbm = this.ComboNodos;
        this.TreeView.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) TreeView.getLastSelectedPathComponent();
                if (selectedNode != null) {
                    // Obteniendo el nombre del nodo seleccionado
                    String selectedName = selectedNode.toString().split(":")[0];

                    // Agregando las líneas de depuración para ver el proceso de selección y búsqueda
                    System.out.println("Nodo seleccionado: " + selectedName);
                    NodoHijo nodoEncontrado = arbol != null ? arbol.searchNode(selectedName) : null;
                    if (nodoEncontrado != null) {
                        System.out.println("Nodo encontrado: " + nodoEncontrado.getNodoArbol().getNombre());
                    } else {
                        System.out.println("Nodo no encontrado para: " + selectedName);
                    }

                    nodoSeleccionado = nodoEncontrado;

                    if (nodoSeleccionado != null) {
                        cbm.setSelectedItem(nodoSeleccionado.toString());
                        updateData();
                    } else {
                        // Si nodoSeleccionado es nulo, asegurarse de que la interfaz no desaparezca
                        LblCNombre.setText("___");
                        JOptionPane.showMessageDialog(null, "Nodo no encontrado");
                    }
                }
            }
        });


        arbol = new Tree(null);
        updateGui();
    }

    public void updateData() {
        if (this.nodoSeleccionado != null) {
            this.LblCNombre.setText(nodoSeleccionado.getNodoArbol().getNombre());
        } else {
            this.LblCNombre.setText("___");
        }
    }


    private void updateGui() {
        if (arbol != null && arbol.toString().trim().isEmpty()) {
            TreeView.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Árbol Vacío")));
        } else {
            TreeView.setModel(new DefaultTreeModel(Tree.text2DTree(arbol.toString())));
        }
        this.ComboNodos.removeAllItems();
        if (arbol != null) {
            for (String line : arbol.nodes2StringArray()) {
                this.ComboNodos.addItem(line);
            }
        }
    }

//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnInsertar = new javax.swing.JButton();
        ComboNodos = new javax.swing.JComboBox<>();
        BtnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnExpanAll = new javax.swing.JButton();
        BtnNuevo = new javax.swing.JButton();
        LblNombre = new javax.swing.JLabel();
        Scroll = new javax.swing.JScrollPane();
        TreeView = new javax.swing.JTree();
        TxtNombre = new javax.swing.JTextField();
        LblNombre1 = new javax.swing.JLabel();
        LblCNombre = new javax.swing.JLabel();
        LblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GenTree");
        setResizable(false);

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

        BtnExpanAll.setText("Expandir");
        BtnExpanAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExpanAllActionPerformed(evt);
            }
        });

        BtnNuevo.setText("Nuevo");
        BtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoActionPerformed(evt);
            }
        });

        LblNombre.setText("Nombre:");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("ARBOL VACIO");
        TreeView.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        Scroll.setViewportView(TreeView);

        LblNombre1.setText("Nombre:");

        LblCNombre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LblCNombre.setText("___");

        LblTitle.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        LblTitle.setForeground(new java.awt.Color(51, 0, 255));
        LblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTitle.setText("Datos de nodo seleccionado");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 8)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Erick Vera, Cristian Bastidas, Carlos Estrada");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 8)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("EPN 2021 -Estructura de Datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ComboNodos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnExpanAll, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblNombre1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblCNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtNombre)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnNuevo)
                            .addComponent(BtnExpanAll))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblNombre)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addComponent(ComboNodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnInsertar)
                            .addComponent(BtnEliminar)
                            .addComponent(BtnModificar))
                        .addGap(18, 18, 18)
                        .addComponent(LblTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblNombre1)
                            .addComponent(LblCNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoActionPerformed
        if (this.TxtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre es obligatorio");
            this.TxtNombre.requestFocus();
        } else {
            try {
                NodoArbol nodoArbol = new NodoArbol((short) 1, this.TxtNombre.getText(), "TipoNodo", "TipoExpresion", "Expresion");
                NodoHijo nuevoNodo = new NodoHijo((short) 0, 'T', (short) 0, nodoArbol);

                arbol = new Tree(nuevoNodo);
                updateGui();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_BtnNuevoActionPerformed

    private void BtnExpanAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExpanAllActionPerformed
        expandAllNodes(this.TreeView, flag);
    }//GEN-LAST:event_BtnExpanAllActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
        if (this.ComboNodos.getSelectedIndex() != -1) {
            if (this.TxtNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "El nombre es obligatorio");
                this.TxtNombre.requestFocus();
            } else {
                try {
                    String nuevoNombre = this.TxtNombre.getText();
                    NodoArbol nuevoNodoArbol = new NodoArbol((short) nodoSeleccionado.getNodoArbol().getNodoId(), nuevoNombre, nodoSeleccionado.getNodoArbol().getTipoNodo(), nodoSeleccionado.getNodoArbol().getTipoExpresion(), nodoSeleccionado.getNodoArbol().getExpresion());
                    arbol.modifyNode(nodoSeleccionado, nuevoNodoArbol);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, e);
                }
                updateGui();
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado el nodo a modificar");
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        if (this.ComboNodos.getSelectedIndex() != -1) {
            arbol.removeNode(nodoSeleccionado);
            updateGui();
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado el nodo a eliminar");
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInsertarActionPerformed
        if (nodoSeleccionado != null) {
            if (this.TxtNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "El nombre es obligatorio");
                this.TxtNombre.requestFocus();
            } else {
                try {
                    String tipoNodo = JOptionPane.showInputDialog(this, "Ingrese el tipo de nodo (Activos, Sentencias, Variables):");
                    NodoArbol nuevoNodoArbol;

                    switch (tipoNodo) {
                        case "Activos":
                            String tipo = JOptionPane.showInputDialog(this, "Ingrese el tipo de activo:");
                            String estado = JOptionPane.showInputDialog(this, "Ingrese el estado del activo:");
                            boolean monitor = JOptionPane.showInputDialog(this, "¿Es un monitor? (T/F)").equalsIgnoreCase("T");
                            String docEstado = JOptionPane.showInputDialog(this, "Ingrese el documento de estado:");
                            nuevoNodoArbol = new Activos(tipo, estado, monitor, docEstado, (short) 1, this.TxtNombre.getText(), "Activos", "TipoExpresion", "Expresion");
                            break;
                        case "Sentencias":
                            String query = JOptionPane.showInputDialog(this, "Ingrese el query:");
                            String estadoSentencia = JOptionPane.showInputDialog(this, "Ingrese el estado de la sentencia:");
                            Date fechaAprobacion = new Date(); // Por ahora solo creamos la fecha actual
                            nuevoNodoArbol = new Sentencias(query, estadoSentencia, fechaAprobacion, (short) 1, this.TxtNombre.getText(), "TipoExpresion", "Expresion");
                            break;
                        case "Variables":
                            String tipoVariable = JOptionPane.showInputDialog(this, "Ingrese el tipo de variable:");
                            short largo = Short.parseShort(JOptionPane.showInputDialog(this, "Ingrese el largo de la variable:"));
                            short valorEntero = Short.parseShort(JOptionPane.showInputDialog(this, "Ingrese el valor entero de la variable:"));
                            BigDecimal valorReal = new BigDecimal(JOptionPane.showInputDialog(this, "Ingrese el valor real de la variable:"));
                            String vectorEntero = JOptionPane.showInputDialog(this, "Ingrese el vector entero:");
                            String vectorString = JOptionPane.showInputDialog(this, "Ingrese el vector string:");
                            String valorString = JOptionPane.showInputDialog(this, "Ingrese el valor string:");
                            nuevoNodoArbol = new VariablesContexto(tipoVariable, largo, valorEntero, valorReal, vectorEntero, vectorString, valorString, (short) 1, this.TxtNombre.getText(), "Variables", "TipoExpresion", "Expresion");
                            break;
                        default:
                            JOptionPane.showMessageDialog(this, "Tipo de nodo no reconocido.");
                            return;
                    }

                    NodoHijo nuevoNodoHijo = new NodoHijo(nodoSeleccionado.getNodoArbol().getNodoId(), 'T', (short) 0, nuevoNodoArbol);
                    arbol.addNewNode(nodoSeleccionado, nuevoNodoHijo);
                    updateGui();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, e);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado el padre del nodo a insertar");
        }
    }//GEN-LAST:event_BtnInsertarActionPerformed

    private void expandAllNodes(JTree tree, boolean mode) {
        int j = tree.getRowCount();
        int i = 0;
        while (i < j) {
            if (mode) {
                tree.expandRow(i);
                this.BtnExpanAll.setText("Colapsar");
                flag = false;
            } else {
                tree.collapseRow(i);
                this.BtnExpanAll.setText("Expandir");
                flag = true;
            }
            i += 1;
            j = tree.getRowCount();
        }
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            JOptionPane.showMessageDialog(null, e, "Look and feel error", 0);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUITree().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnExpanAll;
    private javax.swing.JButton BtnInsertar;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnNuevo;
    private javax.swing.JComboBox<String> ComboNodos;
    private javax.swing.JLabel LblCNombre;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblNombre1;
    private javax.swing.JLabel LblTitle;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JTree TreeView;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}