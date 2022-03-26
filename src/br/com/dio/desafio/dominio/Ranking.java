package br.com.dio.desafio.dominio;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ranking {
    private List<Dev> devs;

    public List<Dev> getDevs() {
        return devs;
    }

    public void setDevs(List<Dev> devs) {
        this.devs = devs;
    }

    public void imprimeRanking() {
        Collections.sort(devs);

        var result = devs.stream()
                .map(Dev::getNome)
                .collect(Collectors.toList());

        var count = 1;
        System.out.println("Ranking de Devs");
        for (String dev : result) {
            System.out.println(count + "º lugar: " + dev);
            count++;
        }
    }
}
