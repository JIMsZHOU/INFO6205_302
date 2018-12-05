#Genetic Algorithm
`Team member: 
Qixiang Zhou (001822974)
Vaibhavi Khamar (001400149)
Zhouwei Wang (001443886)`

* We use maven and junit4 in the project, please check when you run the project

### Problem description
Use genetic algorithm to do the picture generation. Use components (Genes) to consist a picture (Individual, presented by 2D-Array). Store all pictures in a Priority Queue (Population), and let the fittest serval picture survive.

### We have three approach.
~ First approach: Picture are presented as (0, 1) 2D-Array. break down the target image to create Gene pool. Use those genes to create a valid image. 
~ Second approach: Picture are presented as (0, 1) 2D-Array. Use random line (Gene) to generate image, the experiment is like drawing a picture use pencil.
~ Third approach: Picture are presented by RGB value. Use random circle (Gene) to generate image.

### What is genetic Algorithm
In computer science and operations research, a genetic algorithm (GA) is a metaheuristic inspired by the process of natural selection that belongs to the larger class of evolutionary algorithms (EA). Genetic algorithms are commonly used to generate high-quality solutions to optimization and search problems by relying on bio-inspired operators such as mutation, crossover and selection. John Holland introduced Genetic Algorithm (GA) in 1960 based on the concept of Darwin’s theory of evolution; afterwards, his student Goldberg extended GA in 1989. -- quote from Wikipedia

### Why we choose this problem
* This problem can be solved very intuitively.We can see the trend a picture build.
* picture generation can not be solved use method of exhaustion.
* It is a great experiment, and very fun.

### Others
For more detail, please see our open-sources code, also our PPT file.


