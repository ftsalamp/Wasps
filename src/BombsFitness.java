import org.jgap.IChromosome;

/**
 *
 * @author ftsalamp
 */
public class BombsFitness extends org.jgap.FitnessFunction{

    private int[] m_bombsposition;
    private static Nest[] m_wasps;
    private int m_population;
    @Override
    protected double evaluate(IChromosome ic) {
        Nest[] c_wasps=new Nest[m_wasps.length];
        for(int i=0; i<m_wasps.length;i++){
            c_wasps[i]=new Nest();
            c_wasps[i].setNumberOfWasps(m_wasps[i].getNumberOfWasps());
            c_wasps[i].setPosX(m_wasps[i].getPosX());
            c_wasps[i].setPosY(m_wasps[i].getPosY());
        }
        double temp=calculate(ic, c_wasps);
        return temp;
    }

    public BombsFitness(int[] a_bombsposition, Nest[] wasps, int population) {
        for(int i=0;i<a_bombsposition.length;i++){
            if( a_bombsposition[i] < 1 || a_bombsposition[i] > 100 ){
                throw new IllegalArgumentException(
                    "Coordanates must be between 0 and 99." );
            }
        }
        m_bombsposition = a_bombsposition;
        m_wasps=wasps;
        m_population=population;
    }
    
    public double calculate(IChromosome ic,Nest[] c_wasps){
            double temp;
            int[] newBombs=new int[6];
            for(int i=0;i<6;i++){
                newBombs[i]=(int) ic.getGene(i).getAllele();
            }
        double rate=0;
            for (int i = 0; i < 12; i++)
            {
                if (c_wasps[i].getNumberOfWasps() != 0)
                {
                    temp = (getKilledFromNest(c_wasps[i].getNumberOfWasps(), (getDistanceBetweenPositions(c_wasps[i].getPosX(), c_wasps[i].getPosY(), newBombs[0], newBombs[1]))));

                    if (temp > c_wasps[i].getNumberOfWasps())
                    {
                        temp = c_wasps[i].getNumberOfWasps();
                    }
                    rate = rate + temp;
                    c_wasps[i].setNumberOfWasps(c_wasps[i].getNumberOfWasps() - temp);
                }
                if (c_wasps[i].getNumberOfWasps() != 0)
                {
                    temp = (getKilledFromNest(c_wasps[i].getNumberOfWasps(), (getDistanceBetweenPositions(c_wasps[i].getPosX(), c_wasps[i].getPosY(), newBombs[2], newBombs[3]))));
                    if (temp > c_wasps[i].getNumberOfWasps())
                    {
                        temp = c_wasps[i].getNumberOfWasps();
                    }
                    rate = rate + temp;
                    c_wasps[i].setNumberOfWasps(c_wasps[i].getNumberOfWasps() - temp);
                }
                if (c_wasps[i].getNumberOfWasps() != 0)
                {
                    temp = (getKilledFromNest(c_wasps[i].getNumberOfWasps(), (getDistanceBetweenPositions(c_wasps[i].getPosX(), c_wasps[i].getPosY(), newBombs[4], newBombs[5]))));
                    if (temp > c_wasps[i].getNumberOfWasps())
                    {
                        temp = c_wasps[i].getNumberOfWasps();
                    }
                    rate = rate + temp;
                    c_wasps[i].setNumberOfWasps(c_wasps[i].getNumberOfWasps() - temp);
                }
            }
            return rate;
        }
    
    public static double calculate(int[]newBombs ,Nest[] c_wasps){
        double temp;
        double rate=0;
            for (int i = 0; i < 12; i++)
            {
                if (c_wasps[i].getNumberOfWasps() != 0)
                {
                    temp = (getKilledFromNest(c_wasps[i].getNumberOfWasps(), (getDistanceBetweenPositions(c_wasps[i].getPosX(), c_wasps[i].getPosY(), newBombs[0], newBombs[1]))));

                    if (temp > c_wasps[i].getNumberOfWasps())
                    {
                        temp = c_wasps[i].getNumberOfWasps();
                    }
                    rate = rate + temp;
                    c_wasps[i].setNumberOfWasps(c_wasps[i].getNumberOfWasps() - temp);
                }
                if (c_wasps[i].getNumberOfWasps() != 0)
                {
                    temp = (getKilledFromNest(c_wasps[i].getNumberOfWasps(), (getDistanceBetweenPositions(c_wasps[i].getPosX(), c_wasps[i].getPosY(), newBombs[2], newBombs[3]))));
                    if (temp > c_wasps[i].getNumberOfWasps())
                    {
                        temp = c_wasps[i].getNumberOfWasps();
                    }
                    rate = rate + temp;
                    c_wasps[i].setNumberOfWasps(c_wasps[i].getNumberOfWasps() - temp);
                }
                if (c_wasps[i].getNumberOfWasps() != 0)
                {
                    temp = (getKilledFromNest(c_wasps[i].getNumberOfWasps(), (getDistanceBetweenPositions(c_wasps[i].getPosX(), c_wasps[i].getPosY(), newBombs[4], newBombs[5]))));
                    if (temp > c_wasps[i].getNumberOfWasps())
                    {
                        temp = c_wasps[i].getNumberOfWasps();
                    }
                    rate = rate + temp;
                    c_wasps[i].setNumberOfWasps(c_wasps[i].getNumberOfWasps() - temp);
                }
            }
            return rate;
        }
    
    private static double getDistanceBetweenPositions(int x1, int y1, int x2, int y2){
        double temp = Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2);
        return Math.sqrt(temp);
    }
    
    private static double getKilledFromNest(double n,double d){
        return Math.floor(n * (141.42 / (20 * d + 0.00001)));
    }
}
