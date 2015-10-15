package au.com.shadeven.development.factory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class ReceiptPrinter implements Printable, ActionListener {

  @Override
  public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
    if (pageIndex > 0) return NO_SUCH_PAGE;

    Graphics2D graphics2D = (Graphics2D) graphics;
//    double imageableX = pageFormat.getImageableX();
//    double imageableY = pageFormat.getImageableY();
//    graphics2D.translate(imageableX, imageableY);
//    double imageableWidth = pageFormat.getImageableWidth();
//    double width = pageFormat.getWidth();
//
//    double imageableHeight = pageFormat.getImageableHeight();
//    double height = pageFormat.getHeight();
//
//    Shape shape = graphics2D.getClip();

    graphics2D.setClip(0, 0, 220, 800);
    Shape clip = graphics2D.getClip();
    graphics2D.drawString("Receipt", 100, 100);
    graphics2D.drawLine(101, 101, 200, 101);
    return 0;
  }

  public void actionPerformed(ActionEvent e) {
    PrinterJob job = PrinterJob.getPrinterJob();
    job.setPrintable(this);
    boolean ok = job.printDialog();
    if (ok) {
      try {
        job.print();
      } catch (PrinterException ex) {
              /* The job did not successfully complete */
      }
    }
  }

  public static void main(String args[]) {
    UIManager.put("swing.boldMetal", Boolean.FALSE);
    JFrame f = new JFrame("Hello World Printer");
    f.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    JButton printButton = new JButton("Print Hello World");
    printButton.addActionListener(new ReceiptPrinter());
    f.add("Center", printButton);
    f.pack();
    f.setVisible(true);
  }

}
