# Solution-Kata-Maze-Runner

Solución al Kata de Codewars llamado Maze Runner en Java

https://www.codewars.com/kata/58663693b359c4a6560001d6

En este Kata resolvemos la lógica tras el juego Maze Runner.

* El objetivo principal es determinar si el aventurero llega al fin de la mazmorra sin tocar las paredes o salirse del límite. Al hacerlo moriría.
* El tablero es un array de dos dimensiones NxN.
* Las posiciones libres están representadas con un 0, las paredes con un 1, el inicio con un 2 y el punto final con un 3.
* Las direcciones para avanzar nos vienen dadas en un array con N, S, E, W.
* Si el jugador toca una pared o sale del tablero la función debe devolver "Dead".
* Si no logra salir antes de gastar los movimientos debe devolver "Lost".
* Si consigue ir del punto de partida a la salida sin morir, debe devolver "Finish".

Ejemlo del tablero:

    Maze = [[1,1,1,1,1,1,1],
            [1,0,0,0,0,0,3],
            [1,0,1,0,1,0,1],
            [0,0,1,0,0,0,1],
            [1,0,1,0,1,0,1],
            [1,0,0,0,0,0,1],
            [1,2,1,0,1,0,1]]
