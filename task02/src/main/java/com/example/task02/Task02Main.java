package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл src/test/resources/input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с src/test/resources/expected.test
        // то же самое делает тест main_testFiles

        int prev = System.in.read();
        while (prev != -1) {
            int next = System.in.read();
            if (prev == 13 && next == 10) {
                prev = next;
            } else {
                System.out.write(prev);
                prev = next;
            }
        }

        System.out.flush();
    }
}
