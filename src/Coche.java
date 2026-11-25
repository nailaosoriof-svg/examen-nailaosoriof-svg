@Override
public double precioAlquiler(int dias) {
    double precio = dias * getPrecioDia();
    if (dias >= 7 {
        precio = precio * 0.9;
    }
    return precio;
}

}