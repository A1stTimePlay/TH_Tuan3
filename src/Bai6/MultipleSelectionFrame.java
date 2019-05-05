package Bai6;// Fig. 14.25: MultipleSelectionFrame.java
// Copying items from one List to another.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame 
{
   private JList colorJList;
   private JList copyJList;
   private JButton submitJButton;
   private static final String[] colorNames = {"văn học", "khoa học", "lịch sử", "công nghệ", "thể thao", "văn hóa"};

   public MultipleSelectionFrame()
   {
      super( "Bai 6" );
      setLayout( new FlowLayout() );

      colorJList = new JList( colorNames );
      colorJList.setVisibleRowCount( 5 );
      colorJList.setSelectionMode( 
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
      add( new JScrollPane( colorJList ) );

      submitJButton = new JButton( "Submit" );
      submitJButton.addActionListener(

         new ActionListener()
         {
            public void actionPerformed( ActionEvent event )
            {
               copyJList.setListData( colorJList.getSelectedValues() );
            }
         }
      );

      add( submitJButton );

      copyJList = new JList();
      copyJList.setVisibleRowCount( 5 );
      copyJList.setFixedCellWidth( 100 );
      copyJList.setFixedCellHeight( 15 );
      copyJList.setSelectionMode( 
         ListSelectionModel.SINGLE_INTERVAL_SELECTION );
      add( new JScrollPane( copyJList ) );
   }
}


