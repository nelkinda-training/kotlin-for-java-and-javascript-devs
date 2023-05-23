# Notes

Keywords:
  - `fun` declares a function
  - `class` declares a class
  - `val` declares an immutable value (like `final var` in Java, `const` in JavaScript)
  - `var` declares a mutable value (like `var` in Java, `let` in JavaScript)
  - `data` modifies a class to be a data class
  - `open` modifies a class to be extensible (by default, Kotlin classes are _not_, as if they were `final` in Java)

Operators:
  - `.` (infix) member access
  - `==` (infix) equality (calls .equals() or Objects.equal())
  - `===` (infix) identity (like Java `==`)
  - `?` (postfix) declare something as nullable (not nullable is the default)
  - `!!` (postifx) change from nullable to not-null (performs null check)
  - `?.` null-safe member access ("safe call")
  - `:` (infix) type-specification (declare "is a")
  - `+` (infix) Concatenate strings
  - `..` (infix) Range operator, inclusive end
  - `until` (infix) Range operator, exclusive end

Statements and Expression:
  - `if` is an expression, no ternary operator

Good Kotlin-Style:
- Avoid `?`, avoid `!!`, avoid `?.`

@Service
class PeerReviewService {
    @RequireRole(role = "ADMIN")
    fun getPeerReview(id: UUID<PeerReview>) {
    }
}
