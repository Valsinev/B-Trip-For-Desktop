package org.example;

import org.example.constants.IConfiguration;

import javax.swing.text.Style;
import java.awt.*;

public class Config implements IConfiguration {
    @Override
    public Font getFont() {
        return new Font("Arial", Font.ITALIC, 27);
    }

    @Override
    public Color getFontColor() {
        return Color.BLACK;
    }

    @Override
    public long getDailyMoneyWithoutHotel() {
        return 20L;
    }

    @Override
    public long getDailyMoneyWithHotel() {
        return 40L;
    }

    @Override
    public int getNumberOfDaysInOneOrder() {
        return 8;
    }
}
