[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=21575874)
|Attenzione|
|----------|
|Per leggere correttamente questo documento, click destro su README.md e selezionare Open Preview.|

# Funzioni comuni per le matrici

Scriviamo alcune funzioni di utilità generale, che si possono struttare nei programmi che utilizzano le matrici.


## Esercizio 1
Nel file *Esercizio.java*, completa il contenuto della funzione *assegnaMatrice*, che riempie tutte le celle della matrice con un valore passato come parametro. 

La funzione deve avere i seguenti parametri:
* Parametro di input/output: matrice M da riempire.
* Parametri di input: RIGHE e COLONNE, che rappresentano di quante righe e colonne è composta la matrice.
* Parametro di input: il valore che va inserito nella matrice.
* Parametri di output: nessuno.

In *main()*, dichiarare una matrice 3x5, chiedere all'utente quale valore usare per riempire la matrice e riempire la matrice invocando la funzione assegnaMatrice.<br/>
Visualizzare inoltre il contenuto della matrice con l'istruzione *UtilsMatrice.visualizza(matrice);*

Eseguire il programma per controllare che l'output sia analogo al seguente:
```
Quale valore inserire nelle celle della matrice?
5
Contenuto della matrice matV:
[5 5 5 5 5]
[5 5 5 5 5]
[5 5 5 5 5]
```

<hr/>
<details>
  <summary>Solo dopo aver svolto l'esercizio, apri qui per vedere la soluzione</summary>

```Java
public static void assegnaMatrice( int[][] M, int RIGHE, int COLONNE, int valore ) {
    for (int i=0; i <= RIGHE-1; i=i+1 ) {
        for (int j=0; j <= COLONNE-1; j=j+1) {
            M[i][j] = valore;
        }
    }
}

public static void main(String args[]) {
  int RIGHE = 3;
  int COLONNE = 5;
  int valore;
  int[][] matV = new int[RIGHE][COLONNE];
  System.out.println("Quale valore inserire nelle celle della matrice?");
  valore = Integer.parseInt( in.nextLine() );
  assegnaMatrice(matV, RIGHE, COLONNE, valore);
  System.out.println("Contenuto della matrice matV:");
  UtilsMatrice.visualizza(matV);
}


```
</details>
<hr/>

## Esercizio 2
Nel file *Esercizio.java*, completa il contenuto della funzione *azzeraMatrice*, che riempie tutte le celle della matrice con il valore 0. 

La funzione deve avere i seguenti parametri:
* Parametro di input/output: matrice M da riempire.
* Parametri di input: RIGHE e COLONNE, che rappresentano di quante righe e colonne è composta la matrice.
* Parametri di output: nessuno.

La funzione deve riutilizzare la funzione *assegnaMatrice* già scritta nell'esercizio precedente.

In *main()*, dichiarare una nuova matrice 3x5 e azzerarla usando la funzione *azzeraMatrice*.<br/>
Visualizzare inoltre il contenuto della matrice con l'istruzione *UtilsMatrice.visualizza(matrice);*

Eseguire il programma per controllare che l'output sia analogo al seguente:
```
...
Contenuto della matrice matZ:
[0 0 0 0 0]
[0 0 0 0 0]
[0 0 0 0 0]
```

<hr/>
<details>
  <summary>Solo dopo aver svolto l'esercizio, apri qui per vedere la soluzione</summary>

```Java
public static void azzeraMatrice( int[][] M, int RIGHE, int COLONNE) {
  assegnaMatrice(M, RIGHE, COLONNE, 0);
}

public static void main(String args[]) {
  ...
  int[][] matZ = new int[RIGHE][COLONNE];
  azzeraMatrice(matZ, RIGHE, COLONNE);
  System.out.println("Contenuto della matrice matZ:");
  UtilsMatrice.visualizza(matZ);
}
```
</details>
<hr/>

## Esercizio 3
Nel file *Esercizio.java*, completa il contenuto della funzione *riempiCasuale*, che riempie tutte le celle della matrice con un valore casuale. 

La funzione deve avere i seguenti parametri:
* Parametro di input/output: matrice M da riempire.
* Parametri di input: RIGHE e COLONNE, che rappresentano di quante righe e colonne è composta la matrice.
* Parametri di input: minimo e massimo per il valore casuale da generare.
* Parametri di output: nessuno.

In *main()*, dichiarare una nuova matrice 3x5 e riempirla usando la funzione *riempiCasuale*.<br/>
Visualizzare inoltre il contenuto della matrice con l'istruzione *UtilsMatrice.visualizza(matrice);*

Eseguire il programma per controllare che l'output sia analogo al seguente:
```
...
Contenuto della matrice matR:
[17   36  58 50 91]
[143 103 132 52 21]
[116 149  60 49 82]
```

<hr/>
<details>
  <summary>Solo dopo aver svolto l'esercizio, apri qui per vedere la soluzione</summary>

```Java
public static void riempiCasuale( int[][] M, int RIGHE, int COLONNE, int valMin, int valMax) {
    Random rand = new Random();
    for (int i=0; i <= RIGHE-1; i=i+1 ) {
        for (int j=0; j <= COLONNE-1; j=j+1) {
            M[i][j] = valMin + rand.nextInt((valMax+1)-valMin);
        }
    }
}

public static void main(String args[]) {
  ...
  int[][] matR = new int[RIGHE][COLONNE];
  int valMin = 10;
  int valMax = RIGHE*COLONNE*10;
  riempiCasuale(matR, RIGHE, COLONNE, valMin, valMax);
  System.out.println("Contenuto della matrice matR:");
  UtilsMatrice.visualizza(matR);
}

```
</details>
<hr/>
