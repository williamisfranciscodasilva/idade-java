import javax.swing.JOptionPane;
class idade
{
    public static void main(String args[])
    {
        float id = Float.parseFloat(
        JOptionPane.showInputDialog("Digite sua idade: "));

        if(id >= 1 && id <= 7)
        {
            JOptionPane.showMessageDialog(null, "Você é criança, pois tem apenas "+id+ " anos.");
            System.out.println("Você é criança, pois tem apenas "+id+ " anos.");
        }
        else if(id > 7 && id <= 13)
        {
            JOptionPane.showMessageDialog(null, "Você é juvenil, pois tem apenas "+id+ " anos.");
            System.out.println("Você é juvenil, pois tem apenas "+id+ " anos.");
        }
        else if(id >13 && id <= 17)
        {
            JOptionPane.showMessageDialog(null, "Você é adolescente de menor, pois tem apenas "+id+ " anos.");
            System.out.println("Você é adolescente de menor, pois tem apenas "+id+ " anos.");
        }
        else if(id >17 && id <= 39)
        {
            JOptionPane.showMessageDialog(null, "Você é jovem adulto, pois tem apenas "+id+ " anos.");
            System.out.println("Você é jovem adulto, pois tem apenas "+id+ " anos.");
        }
        else if(id >39 && id <= 55 )
        {
            JOptionPane.showMessageDialog(null, "Você é adulto maduro, pois tem apenas "+id+ " anos.");
            System.out.println("Você é adulto maduro, pois tem apenas "+id+ " anos.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Você é idoso, pois tem apenas "+id+ " anos.");
            System.out.println("Você é idoso, pois tem apenas "+id+ " anos.");
        }
    }
}