using System;

Console.WriteLine("Digite a frase invertida de Yoda:");
string fraseYoda = Console.ReadLine() ?? "";

// TODO: Complete o código para inverter a frase
// Dica: Divida a frase em palavras, inverta a ordem e junte novamente
string[] palavras = fraseYoda.Split(' ', StringSplitOptions.RemoveEmptyEntries);
Array.Reverse(palavras);
string fraseCorrigida = string.Join(' ', palavras);

Console.WriteLine("Frase corrigida de Yoda: " + fraseCorrigida);

// Parte 2: Listando aprendizados Jedi
Console.WriteLine("\nAgora, compartilhe três lições que você aprendeu como Padawan:");

string[] licoes = new string[3];

// TODO: Coletar 3 lições do usuário e armazená-las no array
for (int i = 0; i < 3; i++)
{
    Console.WriteLine($"Lição {i + 1}: ");
    licoes[i] = Console.ReadLine() ?? "";
}

// TODO: Exibir as lições formatadas
Console.WriteLine("\nSeus aprendizados como Padawan:");
for (int i = 0; i < licoes.Length; i++)
{
    Console.WriteLine($"{i + 1}. {licoes[i]}");
}
