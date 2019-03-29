package gui_L4;

import java.awt.HeadlessException;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class IpProgrammFrame extends JFrame
{
  private String ip;

  public IpProgrammFrame() throws HeadlessException
  {
    setTitle("Current IP");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    String ip = "";
    try
    {
      ip = InetAddress.getLocalHost().getHostAddress();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }

    JPanel jPanel = new JPanel();
    jPanel.add(new JLabel("IP = " + ip));
    this.getContentPane().add(jPanel);
    this.pack();
    this.setVisible(true);


  }

  public String getIp()
  {
    return ip;
  }
}
