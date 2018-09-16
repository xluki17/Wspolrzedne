public class Punkt {

    int wspX;
    int wspY;

    void ustawX(int x) {
        wspX = x;
    }

    void ustawY(int y) {
        wspY = y;
    }

    int dajX() {
        return wspX;
    }

    int dajY() {
        return wspY;
    }

    public void zwiekszX() {
        wspX++;
    }

    public void zwiekszY() {
        wspY++;
    }

    void zmienY(int liczba) {
        wspY = +liczba;
    }

    void zmienX(int liczba) {
        wspX = +liczba;
    }

    int zwrocX() {
        return wspX;
    }

    int zwrocY() {
        return wspY;
    }

    void wyswietl() {
        System.out.println("współrzędne to: " + wspX + ", " + wspY);
    }

}
