package fr0sty_fun_gr0up.models;

import java.io.File;
import java.util.*;

/**
 * Represents a DnD character with attributes including species, class, origin, ability scores, and more.
 * Uses factory methods to control instantiation and ensure valid defaults.
 */
public class Character {
    // Core Fields
    private int id; // Primary key
    private String name;
    private Species species;
    private List<CharacterClass> characterClasses; // Supports multiclassing
    private Map<CharacterClass, Integer> classLevels; // Tracks levels for each class
    private Origin origin;
    private int experience;
    private AbilityScores abilityScores;

    // Combat Fields
    private int hitPoints;
    private int armorClass;
    private int speed;
    private int initiative;
    private String hitDiceType; // e.g., "d8"
    private int currentHitDice;

    // Personality and Narrative Fields
    private String personalityTraits;
    private String ideals;
    private String bonds;
    private String flaws;

    // Skills
    private Map<String, Integer> skills; // Skill name mapped to total modifier

    // Attacks
    private List<Attack> attacks; // List of character's attacks

    // Equipment and Abilities
    private List<Equipment> equipment;
    private List<Proficiency> proficiencies;
    private List<Spell> spells;

    // Other
    private File portrait; // Character portrait as an image file

    /**
     * Default constructor; creates a character with placeholder values for all fields.
     * Used by the factory method {@link #createEmptyCharacter()}.
     */
    private Character() {
        this.id = -1;
        this.name = "Default";
        this.species = null;
        this.characterClasses = new ArrayList<>();
        this.classLevels = new HashMap<>();
        this.experience = 0;
        this.abilityScores = new AbilityScores();
        this.hitPoints = 0;
        this.armorClass = 0;
        this.speed = 30;
        this.initiative = 0;
        this.hitDiceType = "d6";
        this.currentHitDice = 0;
        this.personalityTraits = "";
        this.ideals = "";
        this.bonds = "";
        this.flaws = "";
        this.skills = new HashMap<>();
        this.attacks = new ArrayList<>();
        this.equipment = new ArrayList<>();
        this.proficiencies = new ArrayList<>();
        this.spells = new ArrayList<>();
        this.portrait = null; // Portrait is initially unset
    }

    /**
     * Full constructor for creating a new character with all fields provided.
     */
    private Character(int id, String name, Species species, List<CharacterClass> characterClasses,
                      Map<CharacterClass, Integer> classLevels, Origin origin, int experience,
                      AbilityScores abilityScores, int hitPoints, int armorClass, int speed, int initiative,
                      String hitDiceType, int currentHitDice, String personalityTraits, String ideals,
                      String bonds, String flaws, Map<String, Integer> skills, List<Attack> attacks,
                      List<Equipment> equipment, List<Proficiency> proficiencies, List<Spell> spells, File portrait) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.characterClasses = characterClasses;
        this.classLevels = classLevels;
        this.origin = origin;
        this.experience = experience;
        this.abilityScores = abilityScores;
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;
        this.speed = speed;
        this.initiative = initiative;
        this.hitDiceType = hitDiceType;
        this.currentHitDice = currentHitDice;
        this.personalityTraits = personalityTraits;
        this.ideals = ideals;
        this.bonds = bonds;
        this.flaws = flaws;
        this.skills = skills;
        this.attacks = attacks;
        this.equipment = equipment;
        this.proficiencies = proficiencies;
        this.spells = spells;
        this.portrait = portrait;
    }

    /**
     * Factory method to create an empty character.
     *
     * @return A new instance of {@code Character} with default settings.
     */
    public static Character createEmptyCharacter() {
        return new Character();
    }

    /**
     * Factory method to create a fully initialized character.
     */
    public static Character createNewCharacter(int id, String name, Species species, List<CharacterClass> characterClasses,
                                               Map<CharacterClass, Integer> classLevels, Origin origin, int experience,
                                               AbilityScores abilityScores, int hitPoints, int armorClass, int speed,
                                               int initiative, String hitDiceType, int currentHitDice, String personalityTraits,
                                               String ideals, String bonds, String flaws, Map<String, Integer> skills,
                                               List<Attack> attacks, List<Equipment> equipment, List<Proficiency> proficiencies,
                                               List<Spell> spells, File portrait) {
        return new Character(id, name, species, characterClasses, classLevels, origin, experience, abilityScores,
                hitPoints, armorClass, speed, initiative, hitDiceType, currentHitDice, personalityTraits, ideals,
                bonds, flaws, skills, attacks, equipment, proficiencies, spells, portrait);
    }
}
