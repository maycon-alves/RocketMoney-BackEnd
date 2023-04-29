# RocketMoney-BackEnd
Projeto de educação financeira.
Versão 1.0.5

Models
 - Pessoa OK
 - Usuario OK 
 - Renda - OK
 - Meta - OK
 - Dica - OK
 - Gasto - Doing
 - GastoFixo
 - GastoMensal
 - FormaPagamento - OK
 
 Enums
 - Usuario
 	- TipoPerfilInvestidorEnum [CONSERVADOR, MODERADO, EXPERIENTE, NAO_INFORMADO]
 	- TipoFaturamentoEnum [FIXO_SEMANAL, FIXO_MENSAL, FIXO_ANUAL, VARIAVEL, MISTO, NAO_INFORMADO]
 - Renda
 	- TipoRendaEnum [ATIVA, PASSIVA]
 	- TipoPeriodicidadeRendaEnum [FIXOSEMANAL, FIXOMENSAL, FIXOANUAL, VARIAVEL]
 	
# Issues e melhorias futuras. :bug:
- inclusão de enums para clase FormaPagamentoDAO.
- revisão do relacionamento entre as entidades: Gasto, GastoFixo e GastoMensal.
- exclusão dos pacotes duplicados para adequação a arquitetura propósta.