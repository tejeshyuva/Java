package additionalPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverser {

    public static <T> void reverse(ArrayList<T> list) {
        if (list == null || list.isEmpty()) {
            return;
        }

        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            Collections.swap(list, i, size - i - 1);
        }
    }
}
