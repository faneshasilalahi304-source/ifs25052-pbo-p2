package domain.entity;

/**
 * Tipe transaksi keuangan: pemasukan atau pengeluaran.
 * Urutan deklarasi dipakai sebagai dasar pengurutan berdasarkan tipe.
 */
public enum TransactionType {
    /** Uang masuk. */
    INCOME,
    /** Uang keluar. */
    EXPENSE
}
