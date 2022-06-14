import { Adresse } from "./adresse";
import { Personne } from "./personne";
import { Module } from "./module";
import { Machine } from "./machine";

<<<<<<< HEAD
export class Formateur  {
    public id: number;
=======
export class Formateur extends Personne {

>>>>>>> 16e153f3859b5daeff356c767d267be414d57f8b
    public module: Module;
    public machine: Machine;
}