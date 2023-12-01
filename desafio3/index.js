class Heroi {
    constructor(nome, idade, tipo = ["guereiro", "mago", "monge", "ninja"], 
               ataque = ["magia", "espada", "usou artes marciais", "usou shuriken"]){
        this.nome;
        this.idade;
        this.tipo;
        this.ataque;
    }

    atacar(){
        let tipo = ["guereiro", "mago", "monge", "ninja"], ataque = ["espada", "magia", "usou artes marciais", "usou shuriken"];
        
            
                if(tipo[0] && ataque[0]){
                    console.log(`O  ${tipo[0]} atacou usando ${ataque[0]} `);
                  
                }
                if(tipo[1] && ataque[1]){
                    console.log(`O  ${tipo[1]} atacou usando ${ataque[1]} `);
                  
                }
                if(tipo[2] && ataque[2]){
                    console.log(`O  ${tipo[2]} atacou usando ${ataque[2]} `);
                  
                }
                if(tipo[3] && ataque[3]){
                    console.log(`O  ${tipo[3]} atacou usando ${ataque[3]} `);
                  
                }
            }
        }
        
    

function Main(){
    heroi = new Heroi();
    heroi.atacar(); 
    
}

Main();

    