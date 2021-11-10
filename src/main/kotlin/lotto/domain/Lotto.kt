package lotto.domain

class Lotto(private val lottoNumbers: LottoNumbers) {

    fun getLottoNumbers(): LottoNumbers = lottoNumbers
    fun convertLottoNumberToInt(): List<Int> = lottoNumbers.toIntList()

    companion object {
        const val PRICE = 1000
        fun generate(): Lotto {
            return Lotto(LottoNumbers.generateLottoNumbers())
        }

        fun from(lottoNumbers: LottoNumbers): Lotto {
            return Lotto(lottoNumbers)
        }
    }
}
