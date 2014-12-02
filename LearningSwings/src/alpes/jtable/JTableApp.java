package alpes.jtable;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class JTableApp {

	public void createTable(){
		JFrame frame=new JFrame();
		String[] columnNames = {"First Name",
                "Last Name",
                "Sport",
                "# of Years",
                "Vegetarian"};
		Object[][] data = {
			    {"Kathy", "Smith",
			     "Snowboarding", new Integer(5), new Boolean(false)},
			    {"John", "Doe",
			     "Rowing", new Integer(3), new Boolean(true)},
			    {"Sue", "Black",
			     "Knitting", new Integer(2), new Boolean(false)},
			    {"Jane", "White",
			     "Speed reading", new Integer(20), new Boolean(true)},
			    {"Joe", "Brown",
			     "Pool", new Integer(10), new Boolean(false)}
			};

		JTable table = new JTable(data, columnNames);
		JScrollPane scrollpane=new JScrollPane(table);
		frame.add(scrollpane);
		frame.setSize(500, 400);
		frame.setVisible(true);
		/*container.setLayout(new BorderLayout());
		container.add(table.getTableHeader(), BorderLayout.PAGE_START);
		container.add(table, BorderLayout.CENTER);*/
	}
	public static void main(String[] args){
		JTableApp ob=new JTableApp();
		ob.createTable();
		System.out.println("HAI");
		
	}
}
