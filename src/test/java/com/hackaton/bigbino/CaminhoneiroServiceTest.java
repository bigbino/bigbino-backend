package com.hackaton.bigbino;

import com.hackaton.bigbino.model.Caminhoneiro;
import com.hackaton.bigbino.service.CaminhoneiroService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CaminhoneiroServiceTest {

    @MockBean
    CaminhoneiroService caminhoneiroService;


    @Test
    public void testCaminhoneiroNome() throws Exception {
        Mockito.when(caminhoneiroService.getCaminhoneiroID(Long.parseLong("1"))).thenReturn(new Caminhoneiro("Pedro", "Cavalcante", "", ""));
        String testName = caminhoneiroService.getCaminhoneiroID(Long.parseLong("1")).getNome();
        Assert.assertEquals("Pedro", testName);
    }

    @Test
    public void testCaminhoneiroNomeNaoIgual() throws Exception {
        Mockito.when(caminhoneiroService.getCaminhoneiroID(Long.parseLong("1"))).thenReturn(new Caminhoneiro("Pedro", "Cavalcante", "", ""));
        String testName = caminhoneiroService.getCaminhoneiroID(Long.parseLong("1")).getNome();
        Assert.assertNotEquals("pedro", testName);
    }

    @Test
    public void testCaminhoneiroSobrenome() throws Exception {
        Mockito.when(caminhoneiroService.getCaminhoneiroID(Long.parseLong("1"))).thenReturn(new Caminhoneiro("Pedro", "Cavalcante", "", ""));
        String testName = caminhoneiroService.getCaminhoneiroID(Long.parseLong("1")).getSobrenome();
        Assert.assertEquals("Cavalcante", testName);
    }

    @Test
    public void testCaminhoneiroSobrenomeNaoIgual() throws Exception {
        Mockito.when(caminhoneiroService.getCaminhoneiroID(Long.parseLong("1"))).thenReturn(new Caminhoneiro("Pedro", "Cavalcante", "", ""));
        String testName = caminhoneiroService.getCaminhoneiroID(Long.parseLong("1")).getSobrenome();
        Assert.assertNotEquals("cavalcante", testName);
    }

    @Test
    public void testCaminhoneiroUsuario() throws Exception {
        Mockito.when(caminhoneiroService.getCaminhoneiroID(Long.parseLong("1"))).thenReturn(new Caminhoneiro("Pedro", "Cavalcante", "pedrohbcavalcante", ""));
        String testName = caminhoneiroService.getCaminhoneiroID(Long.parseLong("1")).getUsuario();
        Assert.assertEquals("pedrohbcavalcante", testName);
    }

    @Test
    public void testCaminhoneiroUsuarioNaoIgual() throws Exception {
        Mockito.when(caminhoneiroService.getCaminhoneiroID(Long.parseLong("1"))).thenReturn(new Caminhoneiro("Pedro", "Cavalcante", "pedrohbcavalcante", ""));
        String testName = caminhoneiroService.getCaminhoneiroID(Long.parseLong("1")).getUsuario();
        Assert.assertNotEquals("PEDROHBCAVALCANTE", testName);
    }



}
