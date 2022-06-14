import { Adresse } from "./adresse";
import { Personne } from "./personne";
import { Module } from "./module";
import { Machine } from "./machine";
import { Formation } from "./formation";
//import { Entreprise } from "./entreprise";

export class Apprenant extends Personne {
    public id: number;
    public candidatAccepte: boolean;
    public formation: Formation;
    public machine: Machine;
    public entreprise: Entreprise;
}