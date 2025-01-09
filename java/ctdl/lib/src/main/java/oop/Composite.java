package oop;

import java.util.List;
import java.util.ArrayList;

class Composite {
    interface FileSystemItem {
        void display(String indent);
    }

    class File implements FileSystemItem {
        private String name;

        public File(String name) {
            this.name = name;
        }

        @Override
        public void display(String indent) {
            System.out.println(indent + name);
        }
    }

    class Dictionary implements FileSystemItem {
        private String name;
        private List<FileSystemItem> children = new ArrayList<>();
        
        public Dictionary(String name) {
            this.name = name;
        }

        public void add(FileSystemItem file) {
            children.add(file);
        }

        public void remove(FileSystemItem file) {
            children.remove(file);
        }

        @Override
        public void display(String indent) {
            System.out.println(indent + name + "Dictionary");
        }
    }
}
