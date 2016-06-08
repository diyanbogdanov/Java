package weekfifteen;

import java.util.Random;

public class GUI extends javax.swing.JFrame {
    private static HeavyElement[] hsArray;
    public GUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnShuffle = new javax.swing.JButton();
        btnPoints = new javax.swing.JButton();
        btnLines = new javax.swing.JButton();
        pntAreaScroll = new javax.swing.JScrollPane();
        pntArea = new javax.swing.JTextArea();
        btnLinesScroll = new javax.swing.JScrollPane();
        lineArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnShuffle.setText("Shuffle");
        btnShuffle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShuffleMouseClicked(evt);
            }
        });

        btnPoints.setText("Points");
        btnPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointsActionPerformed(evt);
            }
        });

        btnLines.setText("Lines");
        btnLines.setActionCommand("Lines");
        btnLines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinesActionPerformed(evt);
            }
        });

        pntArea.setEditable(false);
        pntArea.setColumns(20);
        pntArea.setRows(5);
        pntAreaScroll.setViewportView(pntArea);
        pntArea.getAccessibleContext().setAccessibleDescription("");
        pntArea.getAccessibleContext().setAccessibleParent(this);

        lineArea.setColumns(20);
        lineArea.setRows(5);
        btnLinesScroll.setViewportView(lineArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pntAreaScroll)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnShuffle)
                        .addGap(97, 97, 97)
                        .addComponent(btnPoints)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(btnLines))
                    .addComponent(btnLinesScroll))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pntAreaScroll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLinesScroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShuffle)
                    .addComponent(btnPoints)
                    .addComponent(btnLines))
                .addGap(98, 98, 98))
        );

        btnShuffle.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShuffleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShuffleMouseClicked
        // TODO add your handling code here:
        mixHeavyObjects(hsArray);
    }//GEN-LAST:event_btnShuffleMouseClicked

    private void btnPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPointsActionPerformed
        // TODO add your handling code here:
        String text = "";
        for (int i = 0; i < hsArray.length; i++) {
            if (hsArray[i] instanceof Point) {
                text += String.format("%d - %.2f - %s\n", i, hsArray[i].calcWeight(), hsArray[i].toString());
            }
        }
        pntArea.setText(text);
    }//GEN-LAST:event_btnPointsActionPerformed

    private void btnLinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinesActionPerformed
        // TODO add your handling code here:
        String text = "";
        for (int i = 0; i < hsArray.length; i++) {
            if (hsArray[i] instanceof Line) {
                text += String.format("%d - %.2f - %s\n", i, hsArray[i].calcWeight(), hsArray[i].toString());
            }
        }
        lineArea.setText(text);
    }//GEN-LAST:event_btnLinesActionPerformed

    @SuppressWarnings("empty-statement")
    public static void main(String args[]) {
        Point pointA = new Point(3,1,1);
        Point pointB = new Point(5,3,3);
        Line myLineA = new Line(3,1,1, new Point(7,5,5));
        Line myLineB = new Line(5,3,3, new Point(9,7,7));
        hsArray = new HeavyElement[] {pointA, pointB, myLineA, myLineB};
        
        mixHeavyObjects(hsArray);
        
        new GUI().setVisible(true);
    }
    
    static void mixHeavyObjects(HeavyElement[] hs) {
        Random random = new Random();
        for (int i = hs.length - 1; i > 0; i--) {
          int index = random.nextInt(i + 1);
          //Swap elements
          HeavyElement a = hs[index];
          hs[index] = hs[i];
          hs[i] = a;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLines;
    private javax.swing.JScrollPane btnLinesScroll;
    private javax.swing.JButton btnPoints;
    private javax.swing.JButton btnShuffle;
    private javax.swing.JTextArea lineArea;
    private javax.swing.JTextArea pntArea;
    private javax.swing.JScrollPane pntAreaScroll;
    // End of variables declaration//GEN-END:variables
}
