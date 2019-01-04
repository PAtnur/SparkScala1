import java.awt.Dimension
import scala.swing._
import scala.swing.event.ButtonClicked

object FirstSwingApp extends SimpleSwingApplication {

	/*def main(args: Array[String]): Unit = {
		top
	}*/

		def top = new MainFrame {
			title = "My Frame"
			contents = new GridPanel(5, 5) {
				hGap = 1
				vGap = 1
				contents += new Button {
					text = "Press Me!"
					reactions += {
						case ButtonClicked(_) => text = "HelloWorld"
					}
				}
				contents += new Button {
					text = "Press Me!"
					reactions += {
						case ButtonClicked(_) => text = "abcd"
					}
				}
			}
			size = new Dimension(800, 700)
		}


}