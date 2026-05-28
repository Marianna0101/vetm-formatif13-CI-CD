package org.climoilou.vetm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void cesarCipher_decale_une_lettre() {
        // Arrange
        String message = "abc";
        int offset = 1;

        // Act
        String resultat = Main.cesarCipher(message, offset);

        // Assert
        assertEquals("bcd", resultat);
    }

    @Test
    void cesarCipher_garde_les_espaces() {
        // Arrange
        String message = "a b";
        int offset = 1;

        // Act
        String resultat = Main.cesarCipher(message, offset);

        // Assert
        assertEquals("b c", resultat);
    }

    @Test
    void cesarCipher_revient_au_debut_de_alphabet() {
        // Arrange
        String message = "z";
        int offset = 1;

        // Act
        String resultat = Main.cesarCipher(message, offset);

        // Assert
        assertEquals("a", resultat);
    }

    @Test
    void cesarDecipher_decode_un_message() {
        // Arrange
        String message = "cde";
        int offset = 2;

        // Act
        String resultat = Main.cesarDecipher(message, offset);

        // Assert
        assertEquals("abc", resultat);
    }
}