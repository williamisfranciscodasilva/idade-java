import javax.swing.JOptionPane;
class idade
{
    public static void main(String args[])
    {
        float id = Float.parseFloat(
        JOptionPane.showInputDialog("Digite sua idade: "));

        if(id >= 1 && id <= 7)
        {
            JOptionPane.showMessageDialog(null, "Voc� � crian�a, pois tem apenas "+id+ " anos.");
            System.out.println("Voc� � crian�a, pois tem apenas "+id+ " anos.");
        }
        else if(id > 7 && id <= 13)
        {
            JOptionPane.showMessageDialog(null, "Voc� � juvenil, pois tem apenas "+id+ " anos.");
            System.out.println("Voc� � juvenil, pois tem apenas "+id+ " anos.");
        }
        else if(id >13 && id <= 17)
        {
            JOptionPane.showMessageDialog(null, "Voc� � adolescente de menor, pois tem apenas "+id+ " anos.");
            System.out.println("Voc� � adolescente de menor, pois tem apenas "+id+ " anos.");
        }
        else if(id >17 && id <= 39)
        {
            JOptionPane.showMessageDialog(null, "Voc� � jovem adulto, pois tem apenas "+id+ " anos.");
            System.out.println("Voc� � jovem adulto, pois tem apenas "+id+ " anos.");
        }
        else if(id >39 && id <= 55 )
        {
            JOptionPane.showMessageDialog(null, "Voc� � adulto maduro, pois tem apenas "+id+ " anos.");
            System.out.println("Voc� � adulto maduro, pois tem apenas "+id+ " anos.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Voc� � idoso, pois tem apenas "+id+ " anos.");
            System.out.println("Voc� � idoso, pois tem apenas "+id+ " anos.");
        }
    }
}