# Arquitetura do Sistema


## Camadas
- **Frontend (React SPA)** → interface web.
- **Backend (Node/Java)** → API REST.
- **Domain/Business** → regras de negócio orientadas a objetos.
- **Persistence** → ORM (Prisma/TypeORM ou JPA/Hibernate).
- **Database** → PostgreSQL.


## Diagrama de Classes (Mermaid)
```mermaid
classDiagram
class Usuario {
+UUID id
+String nome
+String email
+String senhaHash
}
class Administrador {
+gerarRelatorio()
}
class Leitor {
+matricula
}
class Livro {
+UUID id
+String titulo
+String autor
+int totalCopias
+int copiasDisponiveis
}
class Emprestimo {
+UUID id
+Date dataEmprestimo
+Date dataDevolucaoPrevista
+Date dataDevolucaoReal
}


Usuario <|-- Administrador
Usuario <|-- Leitor
Leitor "1" -- "*" Emprestimo
Livro "1" -- "*" Emprestimo
