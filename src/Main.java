import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.FitnessFunction;
import org.jgap.Gene;
import org.jgap.GeneticOperator;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;
import org.jgap.impl.MutationOperator;

/**
 *
 * @author ftsalamp
 */
public class Main extends javax.swing.JFrame {
    Nest[] wasps;
    private int[] bombPositions;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        bombPositions=new int[6];
            wasps = new Nest[12];
            for(int i=0;i<12;i++){
                wasps[i]=new Nest();
            }
            wasps[0].setNumberOfWasps(100);
            wasps[0].setPosX(25);
            wasps[0].setPosY(65);

            wasps[1].setNumberOfWasps(200);
            wasps[1].setPosX(23);
            wasps[1].setPosY(8);

            wasps[2].setNumberOfWasps(327);
            wasps[2].setPosX(7);
            wasps[2].setPosY(13);

            wasps[3].setNumberOfWasps(440);
            wasps[3].setPosX(95);
            wasps[3].setPosY(53);

            wasps[4].setNumberOfWasps(450);
            wasps[4].setPosX(3);
            wasps[4].setPosY(3);

            wasps[5].setNumberOfWasps(639);
            wasps[5].setPosX(54);
            wasps[5].setPosY(56);

            wasps[6].setNumberOfWasps(650);
            wasps[6].setPosX(67);
            wasps[6].setPosY(78);

            wasps[7].setNumberOfWasps(678);
            wasps[7].setPosX(32);
            wasps[7].setPosY(4);

            wasps[8].setNumberOfWasps(750);
            wasps[8].setPosX(24);
            wasps[8].setPosY(76);

            wasps[9].setNumberOfWasps(801);
            wasps[9].setPosX(66);
            wasps[9].setPosY(89);

            wasps[10].setNumberOfWasps(945);
            wasps[10].setPosX(84);
            wasps[10].setPosY(4);

            wasps[11].setNumberOfWasps(967);
            wasps[11].setPosX(34);
            wasps[11].setPosY(23);
    }

    public int getProbability(){
        return Integer.parseInt(probability.getText());
    }
    
    public int getPopulation(){
        return Integer.parseInt(populationInput.getText());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        x1 = new javax.swing.JTextField();
        y1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        x2 = new javax.swing.JTextField();
        y2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        x3 = new javax.swing.JTextField();
        y3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        epochs = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        populationInput = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        probability = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("First insect-bomb position:");

        jLabel2.setText("X:");

        jLabel3.setText("Y:");

        jLabel4.setText("Second insect-bomb position:");

        jLabel5.setText("X:");

        jLabel6.setText("Y:");

        jLabel7.setText("Third insect-bomb position:");

        jLabel8.setText("X:");

        jLabel9.setText("Y:");

        jLabel10.setText("Number of Epochs:");

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Population size:");

        jLabel12.setText("Mutation Probability:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(52, 52, 52))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(epochs, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                    .addComponent(populationInput, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                                    .addComponent(probability))
                                .addGap(22, 22, 22))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(74, 74, 74)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(y1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(y2)))))
                        .addGap(0, 142, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(x2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(x3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(epochs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(populationInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(probability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Configuration.reset();
        bombPositions[0]=Integer.parseInt(x1.getText());
        bombPositions[1]=Integer.parseInt(y1.getText());
        bombPositions[2]=Integer.parseInt(x2.getText());
        bombPositions[3]=Integer.parseInt(y2.getText());
        bombPositions[4]=Integer.parseInt(x3.getText());
        bombPositions[5]=Integer.parseInt(y3.getText());
        try{
        // Start with a DefaultConfiguration, which comes setup with the
                    // most common settings.
                    // -------------------------------------------------------------
                    Configuration conf = new DefaultConfiguration();
                    Configuration.resetProperty(Configuration.PROPERTY_FITEVAL_INST);
                    // Set the fitness function we want to use, which is our
                    // BombsFitness that we created earlier.
                    // We construct it with the target amount of change provided
                    // by the user.
                    // ------------------------------------------------------------
                    FitnessFunction myFunc;
                    myFunc = new BombsFitness(bombPositions,wasps, Integer.parseInt(populationInput.getText()));
                    
                    conf.setFitnessFunction( myFunc );
                    
                    // Now we need to tell the Configuration object how we want our
                    // Chromosomes to be setup. We do that by actually creating a
                    // sample Chromosome and then setting it on the Configuration
                    // object. As mentioned earlier, we want our Chromosomes to
                    // each have six genes, one for each of the coordinates of the bombs. We
                    // want the values of those genes to be integers. We therefore use the
                    // IntegerGene class to represent each of the genes. That class
                    // also lets us specify a lower and upper bound, which we set
                    // to sensible values for our level.
                    // --------------------------------------------------------------
                    Gene[] sampleGenes = new Gene[ 6 ];
                    
                    sampleGenes[0] = new IntegerGene(conf, 1, 100 );  // bomb 1x
                    sampleGenes[1] = new IntegerGene(conf, 1, 100 );  // bomb 1y
                    sampleGenes[2] = new IntegerGene(conf, 1, 100);  // bomb 2x
                    sampleGenes[3] = new IntegerGene(conf, 1, 100);  // bomb 2y
                    sampleGenes[4] = new IntegerGene(conf, 1, 100);  // bomb 3x
                    sampleGenes[5] = new IntegerGene(conf, 1, 100);  // bomb 3y
                    
                    Chromosome sampleChromosome = new Chromosome(conf, sampleGenes );
                    
                    conf.setSampleChromosome( sampleChromosome );
                    
                    // Finally, we need to tell the Configuration object how many
                    // Chromosomes we want in our population. The more Chromosomes,
                    // the larger the number of potential solutions (which is good
                    // for finding the answer), but the longer it will take to evolve
                    // the population each round. We'll set the population size to
                    // the value the user has entered in the form.
                    // --------------------------------------------------------------
                    conf.setPopulationSize(Integer.parseInt(populationInput.getText()));
                    
                    ArrayList<GeneticOperator> arr= new ArrayList<GeneticOperator>(conf.getGeneticOperators());
                    for (int i=0;i<arr.size();i++){
                        if (arr.get(i).toString().contains(".MutationOperator@")){
                            ((MutationOperator)arr.get(i)).setMutationRate(getProbability());
                        }
                    }
                    
                    Genotype population = Genotype.randomInitialGenotype( conf );
                    for(int i=0;i<Integer.parseInt(epochs.getText());i++){
                        population.evolve();
                    }
                    IChromosome bestSolutionSoFar = population.getFittestChromosome();
                    int allWasps=0;
                    for (Nest wasp : wasps) {
                        allWasps = (int) (allWasps + wasp.getNumberOfWasps());
                    }
                    double usersSolution=BombsFitness.calculate(bombPositions, wasps);
                    new Results(bestSolutionSoFar.getFitnessValue(), usersSolution,allWasps).setVisible(true);
                } catch (InvalidConfigurationException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new Main().setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField epochs;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField populationInput;
    private javax.swing.JTextField probability;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    private javax.swing.JTextField y1;
    private javax.swing.JTextField y2;
    private javax.swing.JTextField y3;
    // End of variables declaration//GEN-END:variables
}