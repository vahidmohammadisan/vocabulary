package ir.vahidmohammadisan.domain.usecase

interface SuspendUseCase<in Params, out T> {
    suspend fun execute(params: Params) : T
}