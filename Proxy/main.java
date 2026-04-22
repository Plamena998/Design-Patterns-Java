interface Image { void display(); }

class RealImage implements Image {
    public RealImage() { System.out.println("Loading high-res image from disk..."); }
    public void display() { System.out.println("Displaying image."); }
}

class ProxyImage implements Image {
    private RealImage realImage;

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(); // Lazy loading (Мързеливо зареждане)
        }
        realImage.display();
    }
}

// Клиент
public class Main {
    public static void main(String[] args) {
        Image img = new ProxyImage();
        img.display(); // Истинският обект се създава едва тук
    }
}