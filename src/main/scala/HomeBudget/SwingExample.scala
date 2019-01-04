package HomeBudget

import java.awt.Dimension
import java.awt.event.{ActionEvent, ActionListener}

import javax.swing.{JButton, JFrame, JLabel, JPanel}

object SwingExample  {


  def createUI(result:String): Unit ={
    val frame = new JFrame("")
    val label = new JLabel(result)
    label.setVisible(false)
    val panel = new JPanel()
    panel.add(label)
    val button = new JButton(" click here")
    button.addActionListener(new ActionListener {
      override def actionPerformed(e: ActionEvent): Unit = {
        if (!label.isVisible()) {
          label.setVisible(true);
        }
      }
    })
    panel.add(button);
    frame.add(panel);
    frame.setSize(new Dimension(500, 500));

    frame.setVisible(true);
  }


}
