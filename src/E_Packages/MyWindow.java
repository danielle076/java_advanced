package E_Packages;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// AWT = Abstract Window Toolkit
// the * means to import all the class interfaces and static objects from the java.awt class
// the import * would actually be doing everything, but here it's not actually the case:
// there are two different packages here: there's java.awt and there's java.awt.event

public class MyWindow extends Frame {
    public MyWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        g.setFont(sansSerifLarge);
        g.drawString("The Complete Java Developer Course", 60, 60);
        g.setFont(sansSerifSmall);
        g.drawString("by Tim Buchalka", 60, 100);
    }
}

// most of the infrastructure code is automatically in these packages that have been provided by Java. So writing all
// this yourself, writing a window manager that creates fonts, that actually sets different fonts that will have you to
// draw things on the screen, positioning it up certain  places. That would be huge undertaking to do something
// yourself. And it can be months or even years of work, but by using the old package. We can take advantage of the
// facilities that it's provided for these programs