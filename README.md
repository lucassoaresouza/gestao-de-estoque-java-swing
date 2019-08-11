## Sistema de Controle de Estoque:

Este sistema tem como objetivo principal o controle e documentação dos dados referentes a um determinado estoque. Sendo que o utilizando o usuário pode **cadastrar**,**visualizar**,**editar** e **remover** determinados produtos e atribuí-los a tal estoque.

### Pagina Inicial:

![Página Inicial](https://uploaddeimagens.com.br/images/002/254/884/full/tela_inicial.png?1565487654)

A página inicial contém os dados do estoque, os dados de quem o está administrando no momento como também os dados cadastrados. Além dos dados os botões de ações também estão presentes.

### Registro de Produtos:

![Novo Produto](https://uploaddeimagens.com.br/images/002/254/886/full/tobar.png?1565487805)

Ao clicar no botão **Novo Produto** é aberta é aberta a modal com o formulário de cadastro de um novo produto.

![Campos em Branco](https://uploaddeimagens.com.br/images/002/254/894/full/volume_retirado.png?1565487922)

* (String) Registro: É o campo referente ao código do produto
* (String) Produto: É o campo refente ao nome do produto. Ex.: Café
* (String)Descrição: É o espaço reservado a qualquer detalhe do produto. Ex.: marca X
* (Integer) Quantidade: É o espaço referente a quantos volumes de tal produto estão no estoque.

Ao clicar em **Salvar** há o feedback da ação de acordo com o ato do produto ter sido cadastrado ou não.

![Campos Preenchidos](https://uploaddeimagens.com.br/images/002/254/892/full/registrar_produto_renomeado.png?1565487871)
![Produto Cadastrado](https://uploaddeimagens.com.br/images/002/254/888/full/produtos_cadastrados.png?1565487821)

## Adicionar e Remover Volumes

![Atualizar e Remover](https://uploaddeimagens.com.br/images/002/254/896/full/add_rm_produtos.png?1565487951)

Ao selecionar um produto na tabela de dados é possível adicionar ou remover um volume (quantidade) deste produto. Basta clicar em um dos referidos botões.

## Atualizar um Produto

![Atualizar Produto](https://uploaddeimagens.com.br/images/002/254/893/full/atualizar_produto.png?1565487887)

Tendo, também, um produto selecionado na tabela de dados é possível reescreve-lo. Para isto precisa-se clica no botão "Atualizar Produto" e então uma nova modal com o formulário de dados do produto fica disponível e, após as alterações, ao clicar em **Salvar** o sistema registra as alterações realizadas.

![Produto Atualizado](https://uploaddeimagens.com.br/images/002/254/890/full/produto_atualizado.png?1565487838)

## Deletar Produto

![Deletar Produto](https://uploaddeimagens.com.br/images/002/254/897/full/deletar_e_atualizar.png?1565487962)

Diferente dos botões de **Adicionar Volume** e **Remover Volume** o botão **Deletar Produto** deleta todos os dados referentes ao produto selecionado. Para tal ação basta selecionar o produto desejado na tabela de dados e clicar no referido botão.

![Pós deletar](https://uploaddeimagens.com.br/images/002/254/891/full/produto_deletado_com_sucesso.png?1565487853)

## Detalhes do Sistema:

O sistema foi escrito em Java (JDK 1.8) utilizando a IDE NetBeans 8.2 com o auxilio da biblioteca de interface gráfica Swing . Sendo que é possível importar tal projeto diretamente nesta IDE, compila-lo e executa-lo. Entretanto também é possível importar o projeto em outras IDEs como também compila-lo utilizando linhas de comando. 
