import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrefeitoTest {
    @Test
    public void deveRetornarNomeEscola() {
        Prefeito.getInstance().setNome("Marco");
        assertEquals("Marco", Prefeito.getInstance().getNome());
    }
}
