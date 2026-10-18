package com.interview.programs.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingStreamEPAM {
    static class Trainer {
        final String skill;
        final boolean certified;

        Trainer(String skill, boolean certified) {
            this.skill = skill;
            this.certified = certified;
        }
    }

    public static String certifiedSkills(List<Trainer> trainers) {
        return trainers.stream()
                .filter(t -> t.certified)
                .map(t -> t.skill.toLowerCase())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<Trainer> trainers = Arrays.asList(
                new Trainer("Java", true),
                new Trainer("SQL", true),
                new Trainer("Java", true),
                new Trainer("Docker", false),
                new Trainer("Kafka", true)
        );

        String skills = certifiedSkills(trainers);
        System.out.println("skills=" + skills);
    }
}