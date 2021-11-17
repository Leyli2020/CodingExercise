package exercise_6.abstract_class;

import java.util.LinkedList;

public class SearchTree implements NodeList {

    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    } // public SearchTree(ListItem root)

    @Override
    public ListItem getRoot() {
        return root;
    } // public ListItem getRoot()

    @Override
    public boolean addItem(ListItem item) {
        if (root == null) {
            root = item;
            return true;
        } // if (root == null)

        ListItem left, center, right;
        int compare = 1;

        center = root;
        while (compare != 0) {
            compare = center.compareTo(item);

            if (compare > 0) // center item greater than
            {
                left = center.previous();

                if (left == null) {
                    center.setPrevious(item);
                    return true;
                } // if (left == null)

                compare = left.compareTo(item);

                if (compare > 0) // left item greater than
                    center = left;
                else if (compare < 0) // left item less than
                {
                    right = left.next();

                    if (right == null) {
                        left.setNext(item);
                        return true;
                    } // if (right == null)

                    center = right;
                } // else if (compare > 0)
            } // if (compare < 0)
            else if (compare < 0)  // center item lesser
            {
                right = center.next();

                if (right == null) {
                    center.setNext(item);
                    return true;
                } // if (right == null)

                compare = right.compareTo(item);

                if (compare < 0) // right item lesser
                    center = right;
                else if (compare > 0)  // right item greater
                {
                    left = right.previous();

                    if (left == null) {
                        right.setPrevious(item);
                        return true;
                    } // if (left == null)

                    center = left;
                } // else if (compare > 0)
            } // else if (compare < 0)
        } // while (compare != 0)

        return (compare != 0);
    } // public boolean addItem(ListItem item)

    @Override
    public boolean removeItem(ListItem item) {
        ListItem center = root;
        ListItem left, right,
                parent = null,
                child = null;

        int compare = 1;

        if (root == null) {
            System.out.println("Empty list");
            return false;
        } // if (root == null)
        if (root.next() == null && root.previous() == null) {
            root = null;
            return true;
        } // if (root.next() == null && root.previous() == null)

        while (compare != 0) {
            compare = center.compareTo(item);

            if (compare > 0)  // center item greater than
            {
                parent = center;
                left = center.previous();

                if (left == null)
                    return false;

                compare = left.compareTo(item);

                if (compare > 0) // left item greater than
                    center = left;
                else if (compare < 0) // left item less than
                {
                    parent = left;
                    right = left.next();

                    if (right == null)
                        return false;
                    else
                        center = right;
                } // else if (compare < 0)
                else // compare == 0. Left item equals to
                    child = left;
            } // if (compare > 0)
            else if (compare < 0) // center item less than
            {
                parent = center;
                right = center.next();

                if (right == null)
                    return false;

                compare = right.compareTo(item);

                if (compare < 0) // right item less than
                    center = right;
                else if (compare > 0) // right item greater than
                {
                    parent = right;
                    left = right.previous();

                    if (left == null)
                        return false;
                    else
                        center = left;
                } // else if (compare > 0)
                else // compare == 0. Right item equals to
                    child = right;
            } // else if (compare < 0)
            else // compare == 0. Center item equals to
                child = center;
        } // while (compare != 0)

        ListItem minOrMax = null; // The bottom left or right most node, representing the minimum or maximum value
        // in the node and its branches
        ListItem temp; //temporary
        temp = child;
        while ((temp = temp.previous()) != null)
            minOrMax = temp;

        if (minOrMax == null) {
            temp = child;
            while ((temp = temp.next()) != null)
                minOrMax = temp;
        } // if (minOrMax == null)

        if (minOrMax != null)
            child.setValue(minOrMax.getValue());

        performRemoval(child, parent);
        return (compare == 0);
    } // public boolean removeItem(ListItem item)

    private void performRemoval(ListItem child, ListItem parent) // Remove the child nodes of the parent node
    {
        LinkedList<ListItem> list = new LinkedList<>();
        ListItem item;
        if (child.previous() != null) {
            item = new Node(child.previous().getValue());
            performRemoval(child.previous(), child);
            list.add(item);
        } // if (child.previous() != null)

        if (child.next() != null) {
            item = new Node(child.next().getValue());
            performRemoval(child.next(), child);
            list.add(item);
        } // if (child.next() != null)

        if (child.previous() == null && child.next() == null) {
            if (parent != null) {
                if (parent.previous() == child)  //
                    parent.setPrevious(null);
                else if (parent.next() == child)
                    parent.setNext(null);
            } // if (parent != null)
        } // if (child.previous() == null && child.next() == null)

        for (ListItem listItem : list)
            addItem(listItem);

    } // private void performRemoval(ListItem child, ListItem parent)

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
            return;
        } //

        ListItem center;
        ListItem left, right;
        center = root;

        left = center.previous();

        if (left != null)
            traverse(left);

        System.out.println(center.getValue());
        right = center.next();

        if (right != null)
            traverse(right);
    }
}