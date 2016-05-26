/*
 *   UNIANDES - PUYO
 *   Octavo Semestre
 *   Alexander Ulloa
 *   23/05/2016
 */
package ec.edu.uniandes.alexander;

public class clsProducto {

    public int ID() {
        return _ID;
    }

    public void ID(int _ID) {
        this._ID = _ID;
    }

    public String Nombres() {
        return _Nombres;
    }

    public void Nombres(String _Nombres) {
        this._Nombres = _Nombres;
    }

    public float Valor() {
        return _Valor;
    }

    public void Valor(float _Valor) {
        this._Valor = _Valor;
    }

    public unidad Unidad() {
        return _Unidad;
    }

    public void Unidad(unidad _Unidad) {
        this._Unidad = _Unidad;
    }
    
    public enum unidad{Litros, Metros, Libras};
            
             private int _ID;
             private String _Nombres;
             private float _Valor;
             private unidad _Unidad;

    public clsProducto() {
    }

    public clsProducto(int _ID, String _Nombres, float _Valor, unidad _Unidad) {
        this._ID = _ID;
        this._Nombres = _Nombres;
        this._Valor = _Valor;
        this._Unidad = _Unidad;
    }
             
             
             
             
    
}
