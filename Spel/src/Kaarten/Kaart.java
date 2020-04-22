package Kaarten;

/*
    Deze class is om de kaarten array op te bouwen om zo de type kaart de waarde en om zo later de punten toe te weizen misschien.
*/
class Kaart {
    String type;
    int waarde;
    char hogekaarten;

    Kaart(String type, int waarde) {
        this.type = type;
        this.waarde = waarde;
    }

    Kaart(String type) {
        this.type = type;
    }

    Kaart(int waarde) {
        this.waarde = waarde;
    }

    Kaart(char hogekaarten) {
        this.hogekaarten = hogekaarten;
    }
}
