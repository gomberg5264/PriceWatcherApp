package UserInterface.GUI;

import java.awt.Component;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import priceWatcherModel.Item;

/*
 * Custom renderer that is going to render a custom label for displaying the item
 * in a JList.
 */
class ItemRenderer extends ItemComponent implements ListCellRenderer<Item> {

    private static final long serialVersionUID = 6976866887638917348L;

    @Override
    public Component getListCellRendererComponent(
        JList<? extends Item> list, Item item, int index, boolean isSelected,
            boolean cellHasFocus) {
        setItem(item);
        revalidate();
        repaint();
        return this;
    }

}