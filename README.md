W celu uruchomienia progrmau należy wpisać komendę:  
`java -jar pruffer-huffman-assembly-0.1.0-SNAPSHOT.jar <ścieżka do pliku txt>`  
gdzie `<ścieżka do pliku txt>` jest argumentem dla programu, który wskazuje źródło do stworzenia grafu.  
To wygeneruje dwa pliki: `pruffer.txt` oraz  `./graph.dot`,

Do zobrazowania pliku `graph.dot` należy pobrć bibliotekę `graphviz`,  
poprzez komendę `dot -Tjpg graph.dot -o graph.jpg`

Pozdrawiam,
Cezary Piekarczyk
