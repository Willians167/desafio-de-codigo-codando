const readline = require('readline');

// Configuração do input via readline
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Parte 1: Corrigir a frase invertida
rl.question('Digite a frase invertida de Yoda: ', (fraseYoda) => {
  // TODO: Inverter a frase
  const palavras = fraseYoda.split(' ').reverse();
  const fraseCorrigida = palavras.join(' ');

  console.log(`Frase corrigida de Yoda: ${fraseCorrigida}`);

  // Parte 2: Coletar as lições Jedi
  const licoes = [];
  console.log('\nAgora, compartilhe três lições que você aprendeu como Padawan:');
  
  const pedirLicoes = (i) => {
    if (i < 3) {
      rl.question(`Lição ${i + 1}: `, (licao) => {
        licoes.push(licao);
        pedirLicoes(i + 1);
      });
    } else {
      // Exibir as lições formatadas
      console.log('\nSeus aprendizados como Padawan:');
      licoes.forEach((licao, index) => {
        console.log(`${index + 1}. ${licao}`);
      });
      rl.close();
    }
  };

  pedirLicoes(0);
});
